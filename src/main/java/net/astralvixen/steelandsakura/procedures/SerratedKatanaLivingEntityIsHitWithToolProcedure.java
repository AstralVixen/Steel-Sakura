package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.astralvixen.steelandsakura.init.SteelandsakuraModMobEffects;

public class SerratedKatanaLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.6) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SteelandsakuraModMobEffects.BLEED.get(), 600, 1, false, false));
		}
	}
}
