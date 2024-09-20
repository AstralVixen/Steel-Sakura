package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;

public class ContentProviderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 1) {
			{
				String _setval = "In this book you'll" + "\n" + "learn about everything" + "\n" + "related to: Steel &" + "\n" + "Sakura";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 2) {
			{
				String _setval = "Various clans have" + "\n" + "ruled the lands. Here" + "\n" + "you will be introduced" + "\n" + "to all of them, and " + "\n" + "their unique abilities" + "\n" + "and characteristics.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 3) {
			{
				String _setval = "Fierce warriors of" + "\n" + "Kagutsuchi, they weild" + "\n" + "powerul, firery blades" + "\n" + "which can deliver a" + "\n" + "flaming stike.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 4) {
			{
				String _setval = "Dutiful defenders of" + "\n" + "Kukunochi, they wield" + "\n" + "powerul, verdant blades" + "\n" + "which can deliver a" + "\n" + "stunning stike.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 5) {
			{
				String _setval = "Masterful combatants of" + "\n" + "Watatsumi, they wield" + "\n" + "powerul azure blades" + "\n" + "which can deliver a" + "\n" + "freezing stike.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 6) {
			{
				String _setval = "Wealthy servicemen of" + "\n" + "Amaterasu, they wield" + "\n" + "powerul golden blades" + "\n" + "which can boost their" + "\n" + "strenth significantly.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 7) {
			{
				String _setval = "Satutse aka ironsand" + "\n" + "is the most critical" + "\n" + "component of katana" + "\n" + "forging" + "\n" + "\n" + "Found near patches" + "\n" + "of sand, especially" + "\n" + "near rivers.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 8) {
			{
				String _setval = "The tatara is a giant" + "\n" + "clay furnace used to" + "\n" + "smelt satuse." + "\n" + "Start heating it with" + "\n" + "charcoal and reach" + "\n" + "1200-1500\u00B0C for" + "\n" + "results.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 9) {
			{
				String _setval = "The tamahagane" + "\n" + "is the material" + "\n" + "used for forging" + "\n" + "katanas.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		} else if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageNum == 10) {
			{
				String _setval = "The Y\u016Bgen Anvil is a" + "\n" + "tool first used by" + "\n" + "the Y\u016Bgen clan. Able" + "\n" + "to give katanas" + "\n" + "special powers from" + "\n" + "the various kami.";
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageText = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageText;
		}
		return (entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).pageTitle;
	}
}
