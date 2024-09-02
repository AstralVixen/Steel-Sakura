package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;

public class GetStatsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Dan" + (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).dan;
	}
}
