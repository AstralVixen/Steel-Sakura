package net.astralvixen.steelandsakura.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.astralvixen.steelandsakura.entity.TekeTekeEntity;

public class TekeTekeModel extends GeoModel<TekeTekeEntity> {
	@Override
	public ResourceLocation getAnimationResource(TekeTekeEntity entity) {
		return new ResourceLocation("steelandsakura", "animations/teke_teke_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TekeTekeEntity entity) {
		return new ResourceLocation("steelandsakura", "geo/teke_teke_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TekeTekeEntity entity) {
		return new ResourceLocation("steelandsakura", "textures/entities/" + entity.getTexture() + ".png");
	}

}
