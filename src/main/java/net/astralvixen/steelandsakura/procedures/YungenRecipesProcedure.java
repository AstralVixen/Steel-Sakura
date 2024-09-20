package net.astralvixen.steelandsakura.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class YungenRecipesProcedure {

    private static ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotId) {
        AtomicReference<ItemStack> result = new AtomicReference<>(ItemStack.EMPTY);
        BlockEntity entity = world.getBlockEntity(pos);
        if (entity != null) {
            entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> 
                result.set(capability.getStackInSlot(slotId).copy()));
        }
        return result.get();
    }

    private static int getItemAmount(LevelAccessor world, BlockPos pos, int slotId) {
        AtomicInteger result = new AtomicInteger(0);
        BlockEntity entity = world.getBlockEntity(pos);
        if (entity != null) {
            entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> 
                result.set(capability.getStackInSlot(slotId).getCount()));
        }
        return result.get();
    }

    private static void updateSlot(LevelAccessor world, BlockPos pos, int slotId, ItemStack newStack) {
        BlockEntity entity = world.getBlockEntity(pos);
        if (entity != null) {
            entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
                if (capability instanceof IItemHandlerModifiable) {
                    ((IItemHandlerModifiable) capability).setStackInSlot(slotId, newStack);
                }
            });
        }
    }

    private static boolean hasValidOutputSlot(LevelAccessor world, BlockPos pos, int outputSlot, ItemStack outputItem) {
        ItemStack stackInSlot = getItemStack(world, pos, outputSlot);
        return (getItemAmount(world, pos, outputSlot) < 64) &&
               (stackInSlot.isEmpty() || stackInSlot.getItem() == outputItem.getItem());
    }

    private static void executeRecipe(LevelAccessor world, BlockPos pos, ItemStack[] ingredients, ItemStack output) {
        for (int i = 0; i < ingredients.length; i++) {
            ItemStack stack = getItemStack(world, pos, i);
            if (!stack.is(ingredients[i].getItem())) return;
        }

        if (hasValidOutputSlot(world, pos, 3, output)) {
            for (int i = 0; i < ingredients.length; i++) {
                ItemStack stack = getItemStack(world, pos, i);
                stack.shrink(1);
                updateSlot(world, pos, i, stack);
            }

            // Create or update the output stack in slot 3
            ItemStack outputStack = getItemStack(world, pos, 3).copy();
            if (outputStack.isEmpty()) {
                outputStack = output.copy();
                outputStack.setCount(1);
            } else {
                outputStack.grow(1);
            }
            updateSlot(world, pos, 3, outputStack);
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) return;

        BlockPos pos = BlockPos.containing(x, y, z);

        // Recipe 1: Coal Block + Iron Katana + Akai Seal -> Shinkuno Hono
        executeRecipe(world, pos, new ItemStack[]{
            new ItemStack(Blocks.COAL_BLOCK),
            new ItemStack(SteelandsakuraModItems.IRON_KATANA.get()),
            new ItemStack(SteelandsakuraModItems.AKAI_SEAL.get())
        }, new ItemStack(SteelandsakuraModItems.SHINKUNO_HONO.get()));

        // Recipe 2: Moss Block + Iron Katana + Midori Seal -> Midorino Seishin
        executeRecipe(world, pos, new ItemStack[]{
            new ItemStack(Blocks.MOSS_BLOCK),
            new ItemStack(SteelandsakuraModItems.IRON_KATANA.get()),
            new ItemStack(SteelandsakuraModItems.MIDORI_SEAL.get())
        }, new ItemStack(SteelandsakuraModItems.MIDORINO_SEISHIN.get()));

         // Recipe 3: Ice Block + Iron Katana + Aoi Seal -> Midorino Seishin
        executeRecipe(world, pos, new ItemStack[]{
            new ItemStack(Blocks.ICE),
            new ItemStack(SteelandsakuraModItems.IRON_KATANA.get()),
            new ItemStack(SteelandsakuraModItems.AOI_SEAL.get())
        }, new ItemStack(SteelandsakuraModItems.AONAMINO_TSURUGI.get()));

        // Recipe 4: Gold Ingot + Iron Katana +  Kin SEAL -> Koganeno Kage
        executeRecipe(world, pos, new ItemStack[]{
            new ItemStack(Blocks.GOLD_BLOCK),
            new ItemStack(SteelandsakuraModItems.IRON_KATANA.get()),
            new ItemStack(SteelandsakuraModItems.KIN_SEAL.get())
        }, new ItemStack(SteelandsakuraModItems.KOGANENO_KAGE.get()));
    }
}
