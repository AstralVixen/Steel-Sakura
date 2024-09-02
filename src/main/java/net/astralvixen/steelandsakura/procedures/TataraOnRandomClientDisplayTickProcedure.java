package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class TataraOnRandomClientDisplayTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        double particleRadius = 0.3;
        double particleAmount = 0;

        // Get the heat value from the block entity
        double heat = new Object() {
            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity != null)
                    return blockEntity.getPersistentData().getDouble(tag);
                return -1;
            }
        }.getValue(world, BlockPos.containing(x, y, z), "heat");

        // Determine the particle amount based on the heat value
        if (heat >= 450) {
            particleAmount = 40;
        } else if (heat >= 300) {
            particleAmount = 35;
        } else if (heat >= 250) {
            particleAmount = 30;
        } else if (heat >= 150) {
            particleAmount = 20;
        } else if (heat >= 60) {
            particleAmount = 10;
        } else {
            return; // If heat is below 60, do nothing
        }

        // Create particles based on the determined amount
        for (int index0 = 0; index0 < particleAmount; index0++) {
            // Center the particles over the block's opening by making sure they are close to the center
            double offsetX = Mth.nextDouble(RandomSource.create(), -particleRadius, particleRadius); // Small variation along the X-axis
            double offsetZ = Mth.nextDouble(RandomSource.create(), -particleRadius, particleRadius); // Small variation along the Z-axis
            double offsetY = Mth.nextDouble(RandomSource.create(), 0, 0.1); // Slight height variation

            // Now place the particles centered above the block opening
            world.addParticle(ParticleTypes.FLAME, x + 0.5 + offsetX, y + 1 + offsetY, z + 0.5 + offsetZ, 0, 0, 0);
        }
    }
}
