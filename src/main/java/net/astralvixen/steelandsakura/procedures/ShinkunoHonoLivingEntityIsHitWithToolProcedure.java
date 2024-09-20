package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity;

public class ShinkunoHonoLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			entity.setSecondsOnFire(4);
		}
	}
}
