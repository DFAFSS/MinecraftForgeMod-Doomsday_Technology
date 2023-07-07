
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.doomsdaytechnology.item.TiningotsItem;
import net.mcreator.doomsdaytechnology.item.IronpowderItem;
import net.mcreator.doomsdaytechnology.item.IronplateItem;
import net.mcreator.doomsdaytechnology.item.GoldpowderItem;
import net.mcreator.doomsdaytechnology.item.GoldplateItem;
import net.mcreator.doomsdaytechnology.item.CopperpowderItem;
import net.mcreator.doomsdaytechnology.item.CopperplateItem;
import net.mcreator.doomsdaytechnology.item.BronzeingotsItem;
import net.mcreator.doomsdaytechnology.item.BronzeSwordItem;
import net.mcreator.doomsdaytechnology.item.BronzeShovelItem;
import net.mcreator.doomsdaytechnology.item.BronzePickaxeItem;
import net.mcreator.doomsdaytechnology.item.BronzeHoeItem;
import net.mcreator.doomsdaytechnology.item.BronzeAxeItem;
import net.mcreator.doomsdaytechnology.item.BronzeArmorItem;
import net.mcreator.doomsdaytechnology.DoomsdayTechnologyMod;

public class DoomsdayTechnologyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoomsdayTechnologyMod.MODID);
	public static final RegistryObject<Item> FORGINGPRESS = block(DoomsdayTechnologyModBlocks.FORGINGPRESS);
	public static final RegistryObject<Item> IRONPLATE = REGISTRY.register("ironplate", () -> new IronplateItem());
	public static final RegistryObject<Item> GOLDPLATE = REGISTRY.register("goldplate", () -> new GoldplateItem());
	public static final RegistryObject<Item> COPPERPLATE = REGISTRY.register("copperplate", () -> new CopperplateItem());
	public static final RegistryObject<Item> IRONPOWDER = REGISTRY.register("ironpowder", () -> new IronpowderItem());
	public static final RegistryObject<Item> GOLDPOWDER = REGISTRY.register("goldpowder", () -> new GoldpowderItem());
	public static final RegistryObject<Item> COPPERPOWDER = REGISTRY.register("copperpowder", () -> new CopperpowderItem());
	public static final RegistryObject<Item> SHREDDER = block(DoomsdayTechnologyModBlocks.SHREDDER);
	public static final RegistryObject<Item> TINORE = block(DoomsdayTechnologyModBlocks.TINORE);
	public static final RegistryObject<Item> TININGOTS = REGISTRY.register("tiningots", () -> new TiningotsItem());
	public static final RegistryObject<Item> ALLOYFURNACE = block(DoomsdayTechnologyModBlocks.ALLOYFURNACE);
	public static final RegistryObject<Item> BRONZEINGOTS = REGISTRY.register("bronzeingots", () -> new BronzeingotsItem());
	public static final RegistryObject<Item> BRONZE_ARMOR_HELMET = REGISTRY.register("bronze_armor_helmet", () -> new BronzeArmorItem.Helmet());
	public static final RegistryObject<Item> BRONZE_ARMOR_CHESTPLATE = REGISTRY.register("bronze_armor_chestplate", () -> new BronzeArmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZE_ARMOR_LEGGINGS = REGISTRY.register("bronze_armor_leggings", () -> new BronzeArmorItem.Leggings());
	public static final RegistryObject<Item> BRONZE_ARMOR_BOOTS = REGISTRY.register("bronze_armor_boots", () -> new BronzeArmorItem.Boots());
	public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BronzeAxeItem());
	public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BronzePickaxeItem());
	public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BronzeSwordItem());
	public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BronzeShovelItem());
	public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BronzeHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
