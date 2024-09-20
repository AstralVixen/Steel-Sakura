package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.init.SteelandsakuraModEntities;
import net.astralvixen.steelandsakura.entity.KinSamuraiEntity;

public class GetKinModelProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new KinSamuraiEntity(SteelandsakuraModEntities.KIN_SAMURAI.get(), _level) : null;
	}
}
