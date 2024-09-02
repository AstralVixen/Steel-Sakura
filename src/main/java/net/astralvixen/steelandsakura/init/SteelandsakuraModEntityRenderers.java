
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.astralvixen.steelandsakura.client.renderer.YureiRenderer;
import net.astralvixen.steelandsakura.client.renderer.TekeTekeRenderer;
import net.astralvixen.steelandsakura.client.renderer.ShirokamiRenderer;
import net.astralvixen.steelandsakura.client.renderer.OniRenderer;
import net.astralvixen.steelandsakura.client.renderer.MidoriSamuraiRenderer;
import net.astralvixen.steelandsakura.client.renderer.KinSamuraiRenderer;
import net.astralvixen.steelandsakura.client.renderer.FrostOniRenderer;
import net.astralvixen.steelandsakura.client.renderer.EndOniRenderer;
import net.astralvixen.steelandsakura.client.renderer.AoiSamuraiRenderer;
import net.astralvixen.steelandsakura.client.renderer.AkaiSamuraiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SteelandsakuraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SteelandsakuraModEntities.AKAI_SAMURAI.get(), AkaiSamuraiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.MIDORI_SAMURAI.get(), MidoriSamuraiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.AOI_SAMURAI.get(), AoiSamuraiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.FROST_ONI.get(), FrostOniRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.END_ONI.get(), EndOniRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.ONI.get(), OniRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.SHIROKAMI.get(), ShirokamiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.KIN_SAMURAI.get(), KinSamuraiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.YUREI.get(), YureiRenderer::new);
		event.registerEntityRenderer(SteelandsakuraModEntities.TEKE_TEKE.get(), TekeTekeRenderer::new);
	}
}
