
package net.mcreator.doomsdaytechnology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldpowderItem extends Item {
	public GoldpowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
