package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.astralvixen.steelandsakura.init.SteelandsakuraModMobEffects;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

import java.util.UUID;

public class MizuchisGraceOnEffectActiveTickProcedure {

    // Define unique UUIDs for attribute modifiers
    private static final UUID WATER_SPEED_UUID = UUID.fromString("c99a761e-876e-437e-a769-b36c1df95c8a");

    public static void execute(Entity entity) {
        if (entity == null || !(entity instanceof LivingEntity livingEntity))
            return;

        // Check if the entity is in water
        if (livingEntity.isInWater()) {
            int amplifier = livingEntity.getEffect(SteelandsakuraModMobEffects.MIZUCHIS_GRACE.get()).getAmplifier();
           
            // Apply water breathing effect (skip oxygen depletion)
            livingEntity.setAirSupply(livingEntity.getMaxAirSupply());

            // Increase movement speed in water
            applyWaterSpeedBoost(livingEntity, amplifier);

            // Regeneration effect in water (half a heart * amplifier every 2 seconds)
            if (livingEntity.tickCount % 90 == 0) {  // Every 90 ticks
                livingEntity.heal(0.03f * amplifier);
            }
        } else {
            // Remove the speed boost when not in water
            removeAttributeModifiers(livingEntity);
        }
    }

    private static void applyWaterSpeedBoost(LivingEntity livingEntity, int amplifier) {
        if (livingEntity.getAttribute(Attributes.MOVEMENT_SPEED) != null) {
            // Remove any existing modifier to avoid stacking
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(WATER_SPEED_UUID);
            // Apply the new modifier
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).addTransientModifier(
                new AttributeModifier(WATER_SPEED_UUID, "Mizuchi's Grace water speed boost", 0.1 * amplifier, AttributeModifier.Operation.MULTIPLY_TOTAL)
            );
        }
    }

    private static void removeAttributeModifiers(LivingEntity livingEntity) {
        // Remove speed boost when leaving water
        if (livingEntity.getAttribute(Attributes.MOVEMENT_SPEED) != null) {
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(WATER_SPEED_UUID);
        }
    }
}
