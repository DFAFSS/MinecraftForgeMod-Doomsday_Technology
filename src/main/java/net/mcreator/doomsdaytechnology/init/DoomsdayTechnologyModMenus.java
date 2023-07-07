
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.doomsdaytechnology.world.inventory.ShredderguiMenu;
import net.mcreator.doomsdaytechnology.world.inventory.ForgingpressguiMenu;
import net.mcreator.doomsdaytechnology.world.inventory.AlloyfurnaceguiMenu;
import net.mcreator.doomsdaytechnology.DoomsdayTechnologyMod;

public class DoomsdayTechnologyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DoomsdayTechnologyMod.MODID);
	public static final RegistryObject<MenuType<ForgingpressguiMenu>> FORGINGPRESSGUI = REGISTRY.register("forgingpressgui", () -> IForgeMenuType.create(ForgingpressguiMenu::new));
	public static final RegistryObject<MenuType<ShredderguiMenu>> SHREDDERGUI = REGISTRY.register("shreddergui", () -> IForgeMenuType.create(ShredderguiMenu::new));
	public static final RegistryObject<MenuType<AlloyfurnaceguiMenu>> ALLOYFURNACEGUI = REGISTRY.register("alloyfurnacegui", () -> IForgeMenuType.create(AlloyfurnaceguiMenu::new));
}
