
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SteelandsakuraMod.MODID);
	public static final RegistryObject<CreativeModeTab> STEEL_AND_SAKURA = REGISTRY.register("steel_and_sakura",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.steelandsakura.steel_and_sakura")).icon(() -> new ItemStack(SteelandsakuraModItems.ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SteelandsakuraModBlocks.SATETSU.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.TATARA.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.YUGEN_ANVIL.get().asItem());
				tabData.accept(SteelandsakuraModItems.WOODEN_KATANA.get());
				tabData.accept(SteelandsakuraModItems.IRON_KATANA.get());
				tabData.accept(SteelandsakuraModItems.COMPOSITE_KATANA.get());
				tabData.accept(SteelandsakuraModItems.SERRATED_KATANA.get());
				tabData.accept(SteelandsakuraModItems.HEAVY_KATANA.get());
				tabData.accept(SteelandsakuraModItems.SHADOW_KATANA.get());
				tabData.accept(SteelandsakuraModItems.SHINKUNO_HONO.get());
				tabData.accept(SteelandsakuraModItems.MIDORINO_SEISHIN.get());
				tabData.accept(SteelandsakuraModItems.AONAMINO_TSURUGI.get());
				tabData.accept(SteelandsakuraModItems.KOGANENO_KAGE.get());
				tabData.accept(SteelandsakuraModItems.YUNGEN_KATANA.get());
				tabData.accept(SteelandsakuraModItems.RUNE_OF_AKAI.get());
				tabData.accept(SteelandsakuraModItems.RUNE_OF_MIDORI.get());
				tabData.accept(SteelandsakuraModItems.RUNE_OF_AOI.get());
				tabData.accept(SteelandsakuraModItems.RUNE_OF_KIN.get());
				tabData.accept(SteelandsakuraModItems.TAMAHAGANE.get());
				tabData.accept(SteelandsakuraModItems.SPIRIT_ESSENCE.get());
				tabData.accept(SteelandsakuraModItems.AKAI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.MIDORI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.AOI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.FROST_ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.END_ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.SHIROKAMI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.KIN_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.YUREI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.TEKE_TEKE_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.ONI_HEAD_ITEM.get());
				tabData.accept(SteelandsakuraModItems.THE_SHOGUNS_MANUAL.get());
				tabData.accept(SteelandsakuraModBlocks.TATAMI.get().asItem());
			})

					.build());
}
