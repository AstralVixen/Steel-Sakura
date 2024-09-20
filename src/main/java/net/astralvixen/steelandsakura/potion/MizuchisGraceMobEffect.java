
package net.astralvixen.steelandsakura.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.astralvixen.steelandsakura.procedures.MizuchisGraceOnEffectActiveTickProcedure;

public class MizuchisGraceMobEffect extends MobEffect {
	public MizuchisGraceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10040065);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MizuchisGraceOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
