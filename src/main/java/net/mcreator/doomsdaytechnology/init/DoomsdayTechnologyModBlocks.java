
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.doomsdaytechnology.block.TinoreBlock;
import net.mcreator.doomsdaytechnology.block.ShredderBlock;
import net.mcreator.doomsdaytechnology.block.ForgingpressBlock;
import net.mcreator.doomsdaytechnology.block.AlloyfurnaceBlock;
import net.mcreator.doomsdaytechnology.DoomsdayTechnologyMod;

public class DoomsdayTechnologyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DoomsdayTechnologyMod.MODID);
	public static final RegistryObject<Block> FORGINGPRESS = REGISTRY.register("forgingpress", () -> new ForgingpressBlock());
	public static final RegistryObject<Block> SHREDDER = REGISTRY.register("shredder", () -> new ShredderBlock());
	public static final RegistryObject<Block> TINORE = REGISTRY.register("tinore", () -> new TinoreBlock());
	public static final RegistryObject<Block> ALLOYFURNACE = REGISTRY.register("alloyfurnace", () -> new AlloyfurnaceBlock());
}
