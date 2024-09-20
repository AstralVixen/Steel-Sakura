package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.astralvixen.steelandsakura.init.SteelandsakuraModEntities;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = "steelandsakura")
public class RoninRuinsDetectorProcedure {

    private static final int DETECTION_RADIUS = 8; // Radius around the structure within which the player can be detected
    private static final long COOLDOWN_TIME_MS = 15 * 60 * 1000; // 15 minutes

    // Track cooldowns and spawned entities per structure
    private static final Map<BlockPos, Long> structureCooldowns = new HashMap<>();
    private static final Map<BlockPos, UUID> activeEntities = new HashMap<>();

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (!player.level().isClientSide && player instanceof ServerPlayer serverPlayer) {
            if (event.phase == TickEvent.Phase.END) {
                if (checkAndHandleStructure(serverPlayer)) {
                    grantAdvancement(serverPlayer, "steelandsakura:ronin_ruins");
                }
            }
        }
    }

    // Function to check if player is near the custom structure and handle entity spawning
    private static boolean checkAndHandleStructure(ServerPlayer player) {
        Level level = player.level();

        if (!(level instanceof ServerLevel serverLevel)) {
            return false; // Return false if it's not a ServerLevel
        }

        BlockPos playerPos = player.blockPosition();
        ResourceLocation structureID = new ResourceLocation("steelandsakura", "ronin_challenge");
        Structure structure = serverLevel.registryAccess().registryOrThrow(Registries.STRUCTURE).get(structureID);

        if (structure != null) {
            StructureStart structureStart = serverLevel.structureManager().getStructureAt(playerPos, structure);
            if (structureStart != null && structureStart.isValid()) {
                BoundingBox boundingBox = structureStart.getBoundingBox();
                BlockPos center = calculateCenter(boundingBox);

                double distanceSq = playerPos.distSqr(center);
                boolean isNear = distanceSq <= Math.pow(DETECTION_RADIUS, 2);

                if (isNear) {
                    long currentTime = System.currentTimeMillis();
                    Long lastSpawnTime = structureCooldowns.get(center);

                    // Check if cooldown has passed and no active entity exists
                    if ((lastSpawnTime == null || currentTime - lastSpawnTime >= COOLDOWN_TIME_MS) && !isEntityAlive(serverLevel, center)) {
                        Entity spawnedEntity = spawnEntityNearStructure(serverLevel, center);
                        if (spawnedEntity != null) {
                            structureCooldowns.put(center, currentTime); // Update cooldown per structure
                            activeEntities.put(center, spawnedEntity.getUUID()); // Track the entity
                        }
                    }
                }
                
                return isNear;
            }
        }

        return false;
    }

    // Calculate the center of the structure bounding box
    private static BlockPos calculateCenter(BoundingBox boundingBox) {
        int minX = boundingBox.minX();
        int minY = boundingBox.minY();
        int minZ = boundingBox.minZ();
        int maxX = boundingBox.maxX();
        int maxY = boundingBox.maxY();
        int maxZ = boundingBox.maxZ();

        return new BlockPos(
            (minX + maxX) / 2,
            (minY + maxY) / 2,
            (minZ + maxZ) / 2
        );
    }

    // Function to spawn the ronin at the center
    private static Entity spawnEntityNearStructure(ServerLevel serverLevel, BlockPos center) {
        Entity entityToSpawn = SteelandsakuraModEntities.RONIN.get().spawn(serverLevel, center, MobSpawnType.MOB_SUMMONED);
        if (entityToSpawn != null) {
            entityToSpawn.setDeltaMovement(0, 0, 0);
            serverLevel.addFreshEntity(entityToSpawn);
            return entityToSpawn; 
        }
        return null;
    }

    // Function to check if the entity for a structure is still alive
    private static boolean isEntityAlive(ServerLevel serverLevel, BlockPos center) {
        UUID entityUUID = activeEntities.get(center);
        if (entityUUID != null) {
            Entity entity = serverLevel.getEntity(entityUUID);
            if (entity != null && entity.isAlive()) {
                return true; // Entity is still alive
            } else {
                activeEntities.remove(center); // Entity is dead, remove from active list
            }
        }
        return false;
    }

    // Function to grant the advancement
    private static void grantAdvancement(ServerPlayer player, String advancementID) {
        Advancement advancement = ServerLifecycleHooks.getCurrentServer().getAdvancements().getAdvancement(new ResourceLocation(advancementID));

        if (advancement != null) {
            AdvancementProgress progress = player.getAdvancements().getOrStartProgress(advancement);
            if (!progress.isDone()) {
                for (String criterion : progress.getRemainingCriteria()) {
                    player.getAdvancements().award(advancement, criterion);
                }
            }
        }
    }
}
