
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.astralvixen.steelandsakura.block.YugenAnvilBlock;
import net.astralvixen.steelandsakura.block.TataraBlock;
import net.astralvixen.steelandsakura.block.TatamiBlock;
import net.astralvixen.steelandsakura.block.SatetsuBlock;
import net.astralvixen.steelandsakura.block.OniHeadBlock;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SteelandsakuraMod.MODID);
	public static final RegistryObject<Block> SATETSU = REGISTRY.register("satetsu", () -> new SatetsuBlock());
	public static final RegistryObject<Block> TATARA = REGISTRY.register("tatara", () -> new TataraBlock());
	public static final RegistryObject<Block> YUGEN_ANVIL = REGISTRY.register("yugen_anvil", () -> new YugenAnvilBlock());
	public static final RegistryObject<Block> ONI_HEAD = REGISTRY.register("oni_head", () -> new OniHeadBlock());
	public static final RegistryObject<Block> TATAMI = REGISTRY.register("tatami", () -> new TatamiBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
