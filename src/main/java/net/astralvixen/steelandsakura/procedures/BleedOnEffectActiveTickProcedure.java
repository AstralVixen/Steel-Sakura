package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.astralvixen.steelandsakura.init.SteelandsakuraModMobEffects;

public class BleedOnEffectActiveTickProcedure {
    private static final int TICK_INTERVAL = 35; // about 1.5 seconds

    private static int tickCounter = 0;

    public static void execute(Entity entity) {
        if (entity == null || !(entity instanceof LivingEntity livingEntity))
            return;

        if (livingEntity.hasEffect(SteelandsakuraModMobEffects.BLEED.get())) {
            tickCounter++;

            if (tickCounter >= TICK_INTERVAL) {
                int amplifier = livingEntity.getEffect(SteelandsakuraModMobEffects.BLEED.get()).getAmplifier();
				//Remove health based on amplifier
                float healthReduction = 0.2f * (amplifier + 1); // Amplifier 0 -> 0.2, Amplifier 1 -> 0.4, etc.
                livingEntity.setHealth(livingEntity.getHealth() - healthReduction);

                tickCounter = 0; // Reset the tick counter after applying the effect
            }
        }
    }
}
