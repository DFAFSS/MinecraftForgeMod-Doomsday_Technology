
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.doomsdaytechnology.client.gui.ShredderguiScreen;
import net.mcreator.doomsdaytechnology.client.gui.ForgingpressguiScreen;
import net.mcreator.doomsdaytechnology.client.gui.AlloyfurnaceguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DoomsdayTechnologyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DoomsdayTechnologyModMenus.FORGINGPRESSGUI.get(), ForgingpressguiScreen::new);
			MenuScreens.register(DoomsdayTechnologyModMenus.SHREDDERGUI.get(), ShredderguiScreen::new);
			MenuScreens.register(DoomsdayTechnologyModMenus.ALLOYFURNACEGUI.get(), AlloyfurnaceguiScreen::new);
		});
	}
}
