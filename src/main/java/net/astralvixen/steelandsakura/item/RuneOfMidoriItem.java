
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RuneOfMidoriItem extends Item {
	public RuneOfMidoriItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
