
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.astralvixen.steelandsakura.item.YungenKatanaItem;
import net.astralvixen.steelandsakura.item.WoodenKatanaItem;
import net.astralvixen.steelandsakura.item.TheShogunsManualItem;
import net.astralvixen.steelandsakura.item.TamahaganeItem;
import net.astralvixen.steelandsakura.item.SpiritEssenceItem;
import net.astralvixen.steelandsakura.item.ShinkunoHonoItem;
import net.astralvixen.steelandsakura.item.ShadowKatanaItem;
import net.astralvixen.steelandsakura.item.SerratedKatanaItem;
import net.astralvixen.steelandsakura.item.RuneOfMidoriItem;
import net.astralvixen.steelandsakura.item.RuneOfKinItem;
import net.astralvixen.steelandsakura.item.RuneOfAoiItem;
import net.astralvixen.steelandsakura.item.RuneOfAkaiItem;
import net.astralvixen.steelandsakura.item.OniHeadItemItem;
import net.astralvixen.steelandsakura.item.MidorinoSeishinItem;
import net.astralvixen.steelandsakura.item.KoganenoKageItem;
import net.astralvixen.steelandsakura.item.IronKatanaItem;
import net.astralvixen.steelandsakura.item.IconItem;
import net.astralvixen.steelandsakura.item.HeavyKatanaItem;
import net.astralvixen.steelandsakura.item.CompositeKatanaItem;
import net.astralvixen.steelandsakura.item.AonaminoTsurugiItem;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SteelandsakuraMod.MODID);
	public static final RegistryObject<Item> SATETSU = block(SteelandsakuraModBlocks.SATETSU);
	public static final RegistryObject<Item> TAMAHAGANE = REGISTRY.register("tamahagane", () -> new TamahaganeItem());
	public static final RegistryObject<Item> TATARA = block(SteelandsakuraModBlocks.TATARA);
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());
	public static final RegistryObject<Item> IRON_KATANA = REGISTRY.register("iron_katana", () -> new IronKatanaItem());
	public static final RegistryObject<Item> YUGEN_ANVIL = block(SteelandsakuraModBlocks.YUGEN_ANVIL);
	public static final RegistryObject<Item> AKAI_SAMURAI_SPAWN_EGG = REGISTRY.register("akai_samurai_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.AKAI_SAMURAI, -13434880, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> RUNE_OF_AKAI = REGISTRY.register("rune_of_akai", () -> new RuneOfAkaiItem());
	public static final RegistryObject<Item> RUNE_OF_MIDORI = REGISTRY.register("rune_of_midori", () -> new RuneOfMidoriItem());
	public static final RegistryObject<Item> RUNE_OF_AOI = REGISTRY.register("rune_of_aoi", () -> new RuneOfAoiItem());
	public static final RegistryObject<Item> MIDORI_SAMURAI_SPAWN_EGG = REGISTRY.register("midori_samurai_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.MIDORI_SAMURAI, -16751053, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> AOI_SAMURAI_SPAWN_EGG = REGISTRY.register("aoi_samurai_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.AOI_SAMURAI, -16777063, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> FROST_ONI_SPAWN_EGG = REGISTRY.register("frost_oni_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.FROST_ONI, -16764109, -3355393, new Item.Properties()));
	public static final RegistryObject<Item> END_ONI_SPAWN_EGG = REGISTRY.register("end_oni_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.END_ONI, -13434829, -52225, new Item.Properties()));
	public static final RegistryObject<Item> ONI_SPAWN_EGG = REGISTRY.register("oni_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.ONI, -13434880, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> SHIROKAMI_SPAWN_EGG = REGISTRY.register("shirokami_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.SHIROKAMI, -1, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> SHINKUNO_HONO = REGISTRY.register("shinkuno_hono", () -> new ShinkunoHonoItem());
	public static final RegistryObject<Item> MIDORINO_SEISHIN = REGISTRY.register("midorino_seishin", () -> new MidorinoSeishinItem());
	public static final RegistryObject<Item> AONAMINO_TSURUGI = REGISTRY.register("aonamino_tsurugi", () -> new AonaminoTsurugiItem());
	public static final RegistryObject<Item> KOGANENO_KAGE = REGISTRY.register("koganeno_kage", () -> new KoganenoKageItem());
	public static final RegistryObject<Item> KIN_SAMURAI_SPAWN_EGG = REGISTRY.register("kin_samurai_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.KIN_SAMURAI, -6711040, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> RUNE_OF_KIN = REGISTRY.register("rune_of_kin", () -> new RuneOfKinItem());
	public static final RegistryObject<Item> SPIRIT_ESSENCE = REGISTRY.register("spirit_essence", () -> new SpiritEssenceItem());
	public static final RegistryObject<Item> YUNGEN_KATANA = REGISTRY.register("yungen_katana", () -> new YungenKatanaItem());
	public static final RegistryObject<Item> ONI_HEAD = block(SteelandsakuraModBlocks.ONI_HEAD);
	public static final RegistryObject<Item> ONI_HEAD_ITEM = REGISTRY.register("oni_head_item", () -> new OniHeadItemItem());
	public static final RegistryObject<Item> YUREI_SPAWN_EGG = REGISTRY.register("yurei_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.YUREI, -6684673, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEKE_TEKE_SPAWN_EGG = REGISTRY.register("teke_teke_spawn_egg", () -> new ForgeSpawnEggItem(SteelandsakuraModEntities.TEKE_TEKE, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> COMPOSITE_KATANA = REGISTRY.register("composite_katana", () -> new CompositeKatanaItem());
	public static final RegistryObject<Item> SERRATED_KATANA = REGISTRY.register("serrated_katana", () -> new SerratedKatanaItem());
	public static final RegistryObject<Item> HEAVY_KATANA = REGISTRY.register("heavy_katana", () -> new HeavyKatanaItem());
	public static final RegistryObject<Item> WOODEN_KATANA = REGISTRY.register("wooden_katana", () -> new WoodenKatanaItem());
	public static final RegistryObject<Item> SHADOW_KATANA = REGISTRY.register("shadow_katana", () -> new ShadowKatanaItem());
	public static final RegistryObject<Item> THE_SHOGUNS_MANUAL = REGISTRY.register("the_shoguns_manual", () -> new TheShogunsManualItem());
	public static final RegistryObject<Item> TATAMI = block(SteelandsakuraModBlocks.TATAMI);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
