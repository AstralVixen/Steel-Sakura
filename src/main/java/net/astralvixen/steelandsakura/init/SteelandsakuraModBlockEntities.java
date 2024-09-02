
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.astralvixen.steelandsakura.block.entity.YugenAnvilBlockEntity;
import net.astralvixen.steelandsakura.block.entity.TataraBlockEntity;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SteelandsakuraMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TATARA = register("tatara", SteelandsakuraModBlocks.TATARA, TataraBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> YUGEN_ANVIL = register("yugen_anvil", SteelandsakuraModBlocks.YUGEN_ANVIL, YugenAnvilBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
