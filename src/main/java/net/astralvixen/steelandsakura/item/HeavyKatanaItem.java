
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;

public class HeavyKatanaItem extends SwordItem {
	public HeavyKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SteelandsakuraModItems.TAMAHAGANE.get()));
			}
		}, 3, -3.3f, new Item.Properties());
	}
}
