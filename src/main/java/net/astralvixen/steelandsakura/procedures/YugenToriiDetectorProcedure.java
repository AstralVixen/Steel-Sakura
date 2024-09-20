package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity; 
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
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
import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;

@Mod.EventBusSubscriber(modid = "steelandsakura")
public class YugenToriiDetectorProcedure {

    private static final int DETECTION_RADIUS = 8; // Radius around the structure within which the player can be detected

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (!player.level().isClientSide && player instanceof ServerPlayer serverPlayer) {
            // Delay the check a bit to avoid instant triggering
            if (event.phase == TickEvent.Phase.END) {
                boolean isPlayerNearStructure = checkIfPlayerNearStructure(serverPlayer);

                // Set the nearTorii variable based on proximity
                setNearToriiVariable(serverPlayer, isPlayerNearStructure);

                // Grant advancement if near
                if (isPlayerNearStructure) {
                    grantAdvancement(serverPlayer, "steelandsakura:yugen_torii_enter");
                }
            }
        }
    }

    // Check if player is near the custom structure
    private static boolean checkIfPlayerNearStructure(ServerPlayer player) {
        Level level = player.level();

        if (!(level instanceof ServerLevel serverLevel)) {
            return false; // Return false if it's not a ServerLevel
        }

        BlockPos playerPos = player.blockPosition();
        ResourceLocation structureID = new ResourceLocation("steelandsakura", "yugen_torii");
        Structure structure = serverLevel.registryAccess().registryOrThrow(Registries.STRUCTURE).get(structureID);

        if (structure != null) {
            StructureStart structureStart = serverLevel.structureManager().getStructureAt(playerPos, structure);
            if (structureStart != null && structureStart.isValid()) {
                BoundingBox boundingBox = structureStart.getBoundingBox();
                BlockPos center = calculateCenter(boundingBox);

                double distanceSq = playerPos.distSqr(center);
                return distanceSq <= Math.pow(DETECTION_RADIUS, 2); // Return true if within radius
            }
        }

        return false;
    }

    // Calculate the center of a bounding box
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

    // Grant advancement
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

    // Set the nearTorii variable for the player based on proximity
    private static void setNearToriiVariable(Entity entity, boolean isNear) {
        boolean _setval = isNear;
        entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
            capability.nearTorii = _setval;
            capability.syncPlayerVariables(entity); 
        });
    }
}
