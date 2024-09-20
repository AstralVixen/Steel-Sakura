
package net.astralvixen.steelandsakura.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.astralvixen.steelandsakura.entity.SpiritualMirrorCloneEntity;

public class SpiritualMirrorCloneRenderer extends HumanoidMobRenderer<SpiritualMirrorCloneEntity, HumanoidModel<SpiritualMirrorCloneEntity>> {
	public SpiritualMirrorCloneRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SpiritualMirrorCloneEntity entity) {
		return new ResourceLocation("steelandsakura:textures/entities/spiritual_mirror_clone.png");
	}
}
