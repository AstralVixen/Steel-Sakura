
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RuneOfAkaiItem extends Item {
	public RuneOfAkaiItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
