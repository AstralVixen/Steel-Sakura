package net.astralvixen.steelandsakura.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.astralvixen.steelandsakura.world.inventory.SMP1Menu;
import net.astralvixen.steelandsakura.network.SMP1ButtonMessage;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SMP1Screen extends AbstractContainerScreen<SMP1Menu> {
	private final static HashMap<String, Object> guistate = SMP1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next_btn;

	public SMP1Screen(SMP1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

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

		guiGraphics.blit(new ResourceLocation("steelandsakura:textures/screens/shogun_manual_page.png"), this.leftPos + 24, this.topPos + -2, 0, 0, 156, 185, 156, 185);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.smp_1.label_the_shoguns_manual"), 51, 16, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.smp_1.label_in_this_book_youll"), 42, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.smp_1.label_learn_about_everything"), 42, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.smp_1.label_related_to_steel_sakura"), 42, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.steelandsakura.smp_1.label_stee_sakura"), 60, 79, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_next_btn = new ImageButton(this.leftPos + 87, this.topPos + 106, 30, 26, 0, 0, 26, new ResourceLocation("steelandsakura:textures/screens/atlas/imagebutton_next_btn.png"), 30, 52, e -> {
			if (true) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new SMP1ButtonMessage(0, x, y, z));
				SMP1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_btn", imagebutton_next_btn);
		this.addRenderableWidget(imagebutton_next_btn);
	}
}
