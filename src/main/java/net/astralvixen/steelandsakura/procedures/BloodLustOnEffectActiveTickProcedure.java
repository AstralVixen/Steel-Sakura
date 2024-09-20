package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.astralvixen.steelandsakura.init.SteelandsakuraModMobEffects;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import java.util.UUID;

public class BloodLustOnEffectActiveTickProcedure {
    private static final int TICK_INTERVAL = 75;
    private static final UUID SPEED_BOOST_UUID = UUID.fromString("c08c3db4-95e1-44d7-bc2b-0c4b5a7baf97"); // Replace with your UUID
    private static final UUID ATTACK_BOOST_UUID = UUID.fromString("5b4c6376-d4db-4dbb-a4d2-36d2c10a5d0d"); // Replace with your UUID
    private static final double SPEED_BOOST_MULTIPLIER = 0.1;
    private static final double ATTACK_BOOST_MULTIPLIER = 2;
    private static int tickCounter = 0;

    public static void execute(Entity entity) {
        if (entity == null || !(entity instanceof LivingEntity livingEntity))
            return;

        boolean isBloodLustActive = livingEntity.hasEffect(SteelandsakuraModMobEffects.BLOODLUST.get());

        if (isBloodLustActive) {
            tickCounter++;

            if (tickCounter >= TICK_INTERVAL) {
                int amplifier = livingEntity.getEffect(SteelandsakuraModMobEffects.BLOODLUST.get()).getAmplifier();

                // Remove health based on amplifier
                float healthReduction = 0.2f * (amplifier + 1);
                livingEntity.setHealth(livingEntity.getHealth() - healthReduction);

                // Apply attribute modifiers
                applyAttributeModifiers(livingEntity, amplifier);

                // Randomly apply nausea and blindness effects
                if (Math.random() < 0.1) { // 10% chance to apply effects
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 0)); // 3 seconds of Nausea
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40, 0)); // 2 seconds of Blindness
                }

                tickCounter = 0; // Reset the tick counter after applying the effect
            }
        } 
    }

    private static void applyAttributeModifiers(LivingEntity livingEntity, int amplifier) {
        if (livingEntity.getAttribute(Attributes.MOVEMENT_SPEED) != null) {
            // Remove any existing modifier to avoid stacking
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(SPEED_BOOST_UUID);
            // Apply the new modifier
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).addTransientModifier(
                new AttributeModifier(SPEED_BOOST_UUID, "Bloodlust speed boost", SPEED_BOOST_MULTIPLIER * amplifier, AttributeModifier.Operation.MULTIPLY_TOTAL)
            );
        }

        if (livingEntity.getAttribute(Attributes.ATTACK_DAMAGE) != null) {
            // Remove any existing modifier to avoid stacking
            livingEntity.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(ATTACK_BOOST_UUID);
            // Apply the new modifier
            livingEntity.getAttribute(Attributes.ATTACK_DAMAGE).addTransientModifier(
                new AttributeModifier(ATTACK_BOOST_UUID, "Bloodlust attack boost", ATTACK_BOOST_MULTIPLIER * amplifier, AttributeModifier.Operation.MULTIPLY_TOTAL)
            );
        }
    }

}
