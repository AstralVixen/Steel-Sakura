
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.astralvixen.steelandsakura.network.OpenToriiGUIMessage;
import net.astralvixen.steelandsakura.network.DanMenuMessage;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SteelandsakuraModKeyMappings {
	public static final KeyMapping DAN_MENU = new KeyMapping("key.steelandsakura.dan_menu", GLFW.GLFW_KEY_Z, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new DanMenuMessage(0, 0));
				DanMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_TORII_GUI = new KeyMapping("key.steelandsakura.open_torii_gui", GLFW.GLFW_KEY_I, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new OpenToriiGUIMessage(0, 0));
				OpenToriiGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DAN_MENU);
		event.register(OPEN_TORII_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DAN_MENU.consumeClick();
				OPEN_TORII_GUI.consumeClick();
			}
		}
	}
}
