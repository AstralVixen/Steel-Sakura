package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;
import net.astralvixen.steelandsakura.init.SteelandsakuraModEntities;
import net.astralvixen.steelandsakura.entity.MidoriSamuraiEntity;
import net.astralvixen.steelandsakura.entity.KinSamuraiEntity;
import net.astralvixen.steelandsakura.entity.AoiSamuraiEntity;
import net.astralvixen.steelandsakura.entity.AkaiSamuraiEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.astralvixen.steelandsakura.init.SteelandsakuraModBlocks;

public class ModelProviderProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 3) {
			return world instanceof Level _level ? new AkaiSamuraiEntity(SteelandsakuraModEntities.AKAI_SAMURAI.get(), _level) : null;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 4) {
			return world instanceof Level _level ? new AoiSamuraiEntity(SteelandsakuraModEntities.AOI_SAMURAI.get(), _level) : null;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 5) {
			return world instanceof Level _level ? new MidoriSamuraiEntity(SteelandsakuraModEntities.MIDORI_SAMURAI.get(), _level) : null;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 6) {
			return world instanceof Level _level ? new KinSamuraiEntity(SteelandsakuraModEntities.KIN_SAMURAI.get(), _level) : null;
		}
		return null;
	}
}
