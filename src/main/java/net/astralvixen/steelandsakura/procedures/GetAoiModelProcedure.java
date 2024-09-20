package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.init.SteelandsakuraModEntities;
import net.astralvixen.steelandsakura.entity.AoiSamuraiEntity;

public class GetAoiModelProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new AoiSamuraiEntity(SteelandsakuraModEntities.AOI_SAMURAI.get(), _level) : null;
	}
}
