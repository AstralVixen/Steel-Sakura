package net.astralvixen.steelandsakura.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;
import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveShogunManualProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).recievedbook == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SteelandsakuraModItems.THE_SHOGUNS_MANUAL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				boolean _setval = true;
				entity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recievedbook = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
