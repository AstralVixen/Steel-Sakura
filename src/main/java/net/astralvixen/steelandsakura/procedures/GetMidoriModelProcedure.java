package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.init.SteelandsakuraModEntities;
import net.astralvixen.steelandsakura.entity.MidoriSamuraiEntity;

public class GetMidoriModelProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new MidoriSamuraiEntity(SteelandsakuraModEntities.MIDORI_SAMURAI.get(), _level) : null;
	}
}
