package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class AonaminoTsurugiLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			// Check if the entity is a LivingEntity (like a player or mob)
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) entity;

				// Simulate freezing effect
				// Set frostTime to 60 ticks (3 seconds)
				livingEntity.setTicksFrozen(livingEntity.getTicksFrozen() + 60);
			}
		}
	}
}
