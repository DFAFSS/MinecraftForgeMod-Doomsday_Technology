
package net.mcreator.doomsdaytechnology.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.doomsdaytechnology.init.DoomsdayTechnologyModItems;

public class BronzeHoeItem extends HoeItem {
	public BronzeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 361;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DoomsdayTechnologyModItems.BRONZEINGOTS.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
