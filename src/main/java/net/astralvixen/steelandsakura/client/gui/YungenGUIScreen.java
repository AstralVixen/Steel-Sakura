package net.astralvixen.steelandsakura.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.astralvixen.steelandsakura.world.inventory.YungenGUIMenu;
import net.astralvixen.steelandsakura.network.YungenGUIButtonMessage;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class YungenGUIScreen extends AbstractContainerScreen<YungenGUIMenu> {
	private final static HashMap<String, Object> guistate = YungenGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_hammer_2;

	public YungenGUIScreen(YungenGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("steelandsakura:textures/screens/yungen_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.yungen_gui.label_yugen_anvil"), 60, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_hammer_2 = new ImageButton(this.leftPos + 87, this.topPos + 25, 40, 42, 0, 0, 42, new ResourceLocation("steelandsakura:textures/screens/atlas/imagebutton_hammer_2.png"), 40, 84, e -> {
			if (true) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new YungenGUIButtonMessage(0, x, y, z));
				YungenGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_hammer_2", imagebutton_hammer_2);
		this.addRenderableWidget(imagebutton_hammer_2);
	}
}
