
package net.astralvixen.steelandsakura.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.astralvixen.steelandsakura.procedures.MidorinoSeishinLivingEntityIsHitWithToolProcedure;
import net.astralvixen.steelandsakura.init.SteelandsakuraModItems;

import java.util.List;

public class MidorinoSeishinItem extends SwordItem {
	public MidorinoSeishinItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SteelandsakuraModItems.TAMAHAGANE.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MidorinoSeishinLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A72Spirit of the Verdant"));
		list.add(Component.literal("Forged with the essence of nature itself, it empowers its bearer with the strength of the wild. Wielded by the guardians of the Midori Clan. "));
	}
}
