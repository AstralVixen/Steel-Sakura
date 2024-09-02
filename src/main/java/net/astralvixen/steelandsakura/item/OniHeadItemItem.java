
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.astralvixen.steelandsakura.procedures.OniHeadItemRightclickedOnBlockProcedure;

public class OniHeadItemItem extends Item {
	public OniHeadItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		OniHeadItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
