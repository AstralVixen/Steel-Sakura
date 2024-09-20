
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.astralvixen.steelandsakura.client.gui.YungenGUIScreen;
import net.astralvixen.steelandsakura.client.gui.YugenToriiGUIScreen;
import net.astralvixen.steelandsakura.client.gui.TataraGUIScreen;
import net.astralvixen.steelandsakura.client.gui.ShogunsManualTemplateGUIScreen;
import net.astralvixen.steelandsakura.client.gui.DanGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SteelandsakuraModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SteelandsakuraModMenus.TATARA_GUI.get(), TataraGUIScreen::new);
			MenuScreens.register(SteelandsakuraModMenus.YUNGEN_GUI.get(), YungenGUIScreen::new);
			MenuScreens.register(SteelandsakuraModMenus.DAN_GUI.get(), DanGUIScreen::new);
			MenuScreens.register(SteelandsakuraModMenus.SHOGUNS_MANUAL_TEMPLATE_GUI.get(), ShogunsManualTemplateGUIScreen::new);
			MenuScreens.register(SteelandsakuraModMenus.YUGEN_TORII_GUI.get(), YugenToriiGUIScreen::new);
		});
	}
}
