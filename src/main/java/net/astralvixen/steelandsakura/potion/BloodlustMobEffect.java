
package net.astralvixen.steelandsakura.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.astralvixen.steelandsakura.procedures.BloodlustEffectExpiresProcedure;
import net.astralvixen.steelandsakura.procedures.BloodLustOnEffectActiveTickProcedure;

public class BloodlustMobEffect extends MobEffect {
	public BloodlustMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434880);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BloodLustOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		BloodlustEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
