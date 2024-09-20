package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;

public class TitleProviderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 1) {
			{
				String _setval = "The Shogun's Manual";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 2) {
			{
				String _setval = "The clans";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 3) {
			{
				String _setval = "The Akai Clan";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 4) {
			{
				String _setval = "The Aoi Clan";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 5) {
			{
				String _setval = "The Midori Clan";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 6) {
			{
				String _setval = "The Kin Clan";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 7) {
			{
				String _setval = "Satutse";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 8) {
			{
				String _setval = "Tatara";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 9) {
			{
				String _setval = "Tamahagane";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 10) {
			{
				String _setval = "Y\u016Bgen Anvil";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
		}
		return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
	}
}
