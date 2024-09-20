
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
import net.astralvixen.steelandsakura.block.SeiryuWoodBlock;
import net.astralvixen.steelandsakura.block.SeiryuStairsBlock;
import net.astralvixen.steelandsakura.block.SeiryuSlabBlock;
import net.astralvixen.steelandsakura.block.SeiryuPressurePlateBlock;
import net.astralvixen.steelandsakura.block.SeiryuPlanksBlock;
import net.astralvixen.steelandsakura.block.SeiryuLogBlock;
import net.astralvixen.steelandsakura.block.SeiryuLeavesBlock;
import net.astralvixen.steelandsakura.block.SeiryuFenceGateBlock;
import net.astralvixen.steelandsakura.block.SeiryuFenceBlock;
import net.astralvixen.steelandsakura.block.SeiryuButtonBlock;
import net.astralvixen.steelandsakura.block.SeiryuBushBlock;
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
	public static final RegistryObject<Block> SEIRYU_WOOD = REGISTRY.register("seiryu_wood", () -> new SeiryuWoodBlock());
	public static final RegistryObject<Block> SEIRYU_LOG = REGISTRY.register("seiryu_log", () -> new SeiryuLogBlock());
	public static final RegistryObject<Block> SEIRYU_PLANKS = REGISTRY.register("seiryu_planks", () -> new SeiryuPlanksBlock());
	public static final RegistryObject<Block> SEIRYU_LEAVES = REGISTRY.register("seiryu_leaves", () -> new SeiryuLeavesBlock());
	public static final RegistryObject<Block> SEIRYU_STAIRS = REGISTRY.register("seiryu_stairs", () -> new SeiryuStairsBlock());
	public static final RegistryObject<Block> SEIRYU_SLAB = REGISTRY.register("seiryu_slab", () -> new SeiryuSlabBlock());
	public static final RegistryObject<Block> SEIRYU_FENCE = REGISTRY.register("seiryu_fence", () -> new SeiryuFenceBlock());
	public static final RegistryObject<Block> SEIRYU_FENCE_GATE = REGISTRY.register("seiryu_fence_gate", () -> new SeiryuFenceGateBlock());
	public static final RegistryObject<Block> SEIRYU_PRESSURE_PLATE = REGISTRY.register("seiryu_pressure_plate", () -> new SeiryuPressurePlateBlock());
	public static final RegistryObject<Block> SEIRYU_BUTTON = REGISTRY.register("seiryu_button", () -> new SeiryuButtonBlock());
	public static final RegistryObject<Block> SEIRYU_BUSH = REGISTRY.register("seiryu_bush", () -> new SeiryuBushBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
