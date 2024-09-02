
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.astralvixen.steelandsakura.procedures.SerratedKatanaLivingEntityIsHitWithToolProcedure;
import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;

public class SerratedKatanaItem extends SwordItem {
	public SerratedKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 90;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SteelandsakuraModItems.TAMAHAGANE.get()));
			}
		}, 3, -2.8f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SerratedKatanaLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
