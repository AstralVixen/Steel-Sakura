
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RuneOfAoiItem extends Item {
	public RuneOfAoiItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
