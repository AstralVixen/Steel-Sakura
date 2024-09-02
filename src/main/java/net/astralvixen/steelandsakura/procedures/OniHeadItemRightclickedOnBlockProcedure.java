package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.astralvixen.steelandsakura.init.SteelandsakuraModBlocks;

public class OniHeadItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), SteelandsakuraModBlocks.ONI_HEAD.get().defaultBlockState(), 3);
	}
}
