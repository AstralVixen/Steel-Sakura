package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;

public class RoninEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.last_stand = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
