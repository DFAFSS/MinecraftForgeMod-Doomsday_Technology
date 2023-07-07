
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doomsdaytechnology.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoomsdayTechnologyModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("doomsday_technology", "doomsday_technology"),
				builder -> builder.title(Component.translatable("item_group.doomsday_technology.doomsday_technology")).icon(() -> new ItemStack(DoomsdayTechnologyModBlocks.FORGINGPRESS.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DoomsdayTechnologyModBlocks.FORGINGPRESS.get().asItem());
					tabData.accept(DoomsdayTechnologyModItems.IRONPLATE.get());
					tabData.accept(DoomsdayTechnologyModItems.GOLDPLATE.get());
					tabData.accept(DoomsdayTechnologyModItems.COPPERPLATE.get());
					tabData.accept(DoomsdayTechnologyModItems.IRONPOWDER.get());
					tabData.accept(DoomsdayTechnologyModItems.GOLDPOWDER.get());
					tabData.accept(DoomsdayTechnologyModItems.COPPERPOWDER.get());
					tabData.accept(DoomsdayTechnologyModBlocks.SHREDDER.get().asItem());
					tabData.accept(DoomsdayTechnologyModBlocks.TINORE.get().asItem());
					tabData.accept(DoomsdayTechnologyModItems.TININGOTS.get());
					tabData.accept(DoomsdayTechnologyModBlocks.ALLOYFURNACE.get().asItem());
					tabData.accept(DoomsdayTechnologyModItems.BRONZEINGOTS.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_ARMOR_HELMET.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_ARMOR_CHESTPLATE.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_ARMOR_LEGGINGS.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_ARMOR_BOOTS.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_AXE.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_PICKAXE.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_SWORD.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_SHOVEL.get());
					tabData.accept(DoomsdayTechnologyModItems.BRONZE_HOE.get());
				})

		);
	}
}
