package net.astralvixen.steelandsakura.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.network.SteelandsakuraModVariables;
import net.astralvixen.steelandsakura.init.SteelandsakuraModMobEffects;
import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OniAmuletItemInInventoryTickProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SteelandsakuraModItems.ONI_AMULET.get()
				&& (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(SteelandsakuraModMobEffects.BLEED.get())) == true) {
			{
				double _setval = (sourceentity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).bloodamout + 1;
				sourceentity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bloodamout = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			SteelandsakuraMod.LOGGER.warn(("Blood amount is: " + (sourceentity.getCapability(SteelandsakuraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SteelandsakuraModVariables.PlayerVariables())).bloodamout));
		}
	}
}
