package net.astralvixen.steelandsakura.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.astralvixen.steelandsakura.world.inventory.ShogunsManualTemplateGUIMenu;
import net.astralvixen.steelandsakura.procedures.TitleProviderProcedure;
import net.astralvixen.steelandsakura.procedures.ModelProviderProcedure;
import net.astralvixen.steelandsakura.procedures.ContentProviderProcedure;
import net.astralvixen.steelandsakura.network.ShogunsManualTemplateGUIButtonMessage;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShogunsManualTemplateGUIScreen extends AbstractContainerScreen<ShogunsManualTemplateGUIMenu> {
	private final static HashMap<String, Object> guistate = ShogunsManualTemplateGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next_btn;
	ImageButton imagebutton_back_btn;

	public ShogunsManualTemplateGUIScreen(ShogunsManualTemplateGUIMenu container, Inventory inventory, Component text) {
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
		if (ModelProviderProcedure.execute(world, entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 88, this.topPos + 144, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("steelandsakura:textures/screens/shogun_manual_page.png"), this.leftPos + 15, this.topPos + -2, 0, 0, 156, 185, 156, 185);

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
    // Render the title
    guiGraphics.drawString(this.font, TitleProviderProcedure.execute(entity), 46, 7, -65536, false);
    
    // Get the content text
    String contentText = ContentProviderProcedure.execute(entity);

    // Split the text by newline characters (\n)
    String[] lines = contentText.split("\n");

    // Render each line separately with some spacing
    int yOffset = 25;  // Starting Y position for text
    for (String line : lines) {
        guiGraphics.drawString(this.font, line, 36, yOffset, -12829636, false);
        yOffset += 10;  // Increment Y position for the next line (adjust for your needs)
    }
}


	@Override
	public void init() {
		super.init();
		imagebutton_next_btn = new ImageButton(this.leftPos + 123, this.topPos + 142, 30, 26, 0, 0, 26, new ResourceLocation("steelandsakura:textures/screens/atlas/imagebutton_next_btn.png"), 30, 52, e -> {
			if (true) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new ShogunsManualTemplateGUIButtonMessage(0, x, y, z));
				ShogunsManualTemplateGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_btn", imagebutton_next_btn);
		this.addRenderableWidget(imagebutton_next_btn);
		imagebutton_back_btn = new ImageButton(this.leftPos + 105, this.topPos + 153, 27, 16, 0, 0, 16, new ResourceLocation("steelandsakura:textures/screens/atlas/imagebutton_back_btn.png"), 27, 32, e -> {
			if (true) {
				SteelandsakuraMod.PACKET_HANDLER.sendToServer(new ShogunsManualTemplateGUIButtonMessage(1, x, y, z));
				ShogunsManualTemplateGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back_btn", imagebutton_back_btn);
		this.addRenderableWidget(imagebutton_back_btn);
	}
}
