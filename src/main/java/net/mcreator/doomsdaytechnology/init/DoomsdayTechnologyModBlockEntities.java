
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.doomsdaytechnology.block.entity.ShredderBlockEntity;
import net.mcreator.doomsdaytechnology.block.entity.ForgingpressBlockEntity;
import net.mcreator.doomsdaytechnology.block.entity.AlloyfurnaceBlockEntity;
import net.mcreator.doomsdaytechnology.DoomsdayTechnologyMod;

public class DoomsdayTechnologyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DoomsdayTechnologyMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FORGINGPRESS = register("forgingpress", DoomsdayTechnologyModBlocks.FORGINGPRESS, ForgingpressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SHREDDER = register("shredder", DoomsdayTechnologyModBlocks.SHREDDER, ShredderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALLOYFURNACE = register("alloyfurnace", DoomsdayTechnologyModBlocks.ALLOYFURNACE, AlloyfurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
