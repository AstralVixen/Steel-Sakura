
package net.astralvixen.steelandsakura.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.astralvixen.steelandsakura.procedures.BleedOnEffectActiveTickProcedure;

public class BleedMobEffect extends MobEffect {
	public BleedMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
