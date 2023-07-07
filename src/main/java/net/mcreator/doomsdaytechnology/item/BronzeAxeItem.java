
package net.mcreator.doomsdaytechnology.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.doomsdaytechnology.init.DoomsdayTechnologyModItems;

public class BronzeAxeItem extends AxeItem {
	public BronzeAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 361;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 10f;
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
		}, 1, -3f, new Item.Properties());
	}
}
