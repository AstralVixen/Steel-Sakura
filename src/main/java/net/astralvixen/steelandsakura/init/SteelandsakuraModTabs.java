
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
				tabData.accept(SteelandsakuraModItems.THE_SHOGUNS_MANUAL.get());
				tabData.accept(SteelandsakuraModItems.AKAI_SEAL.get());
				tabData.accept(SteelandsakuraModItems.MIDORI_SEAL.get());
				tabData.accept(SteelandsakuraModItems.AOI_SEAL.get());
				tabData.accept(SteelandsakuraModItems.KIN_SEAL.get());
				tabData.accept(SteelandsakuraModItems.YUGEN_SEAL_PIECE.get());
				tabData.accept(SteelandsakuraModItems.YUGEN_SEAL.get());
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
				tabData.accept(SteelandsakuraModItems.TAMAHAGANE.get());
				tabData.accept(SteelandsakuraModItems.SPIRIT_ESSENCE.get());
				tabData.accept(SteelandsakuraModItems.ONI_AMULET.get());
				tabData.accept(SteelandsakuraModItems.ONI_HEAD_ITEM.get());
				tabData.accept(SteelandsakuraModItems.AKAI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.MIDORI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.AOI_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.FROST_ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.END_ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.ONI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.KIN_SAMURAI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.RONIN_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.TEKE_TEKE_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.YUREI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.SHIROKAMI_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModItems.ONRYONO_SHOGUN_SPAWN_EGG.get());
				tabData.accept(SteelandsakuraModBlocks.SATETSU.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.TATAMI.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.TATARA.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.YUGEN_ANVIL.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_WOOD.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_LOG.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_PLANKS.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_LEAVES.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_STAIRS.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_SLAB.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_FENCE.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_FENCE_GATE.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_PRESSURE_PLATE.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_BUTTON.get().asItem());
				tabData.accept(SteelandsakuraModBlocks.SEIRYU_BUSH.get().asItem());
			})

					.build());
}
