
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.doomsdaytechnology.world.features.ores.TinoreFeature;
import net.mcreator.doomsdaytechnology.DoomsdayTechnologyMod;

@Mod.EventBusSubscriber
public class DoomsdayTechnologyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DoomsdayTechnologyMod.MODID);
	public static final RegistryObject<Feature<?>> TINORE = REGISTRY.register("tinore", TinoreFeature::new);
}
