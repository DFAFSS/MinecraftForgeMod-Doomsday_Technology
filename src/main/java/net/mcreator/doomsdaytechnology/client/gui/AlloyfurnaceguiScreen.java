package net.mcreator.doomsdaytechnology.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.doomsdaytechnology.world.inventory.AlloyfurnaceguiMenu;
import net.mcreator.doomsdaytechnology.procedures.RF9Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF8Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF7Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF6Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF5Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF4Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF3Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF2Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF24Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF23Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF22Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF21Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF20Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF1Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF19Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF18Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF17Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF16Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF15Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF14Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF13Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF12Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF11Procedure;
import net.mcreator.doomsdaytechnology.procedures.RF10Procedure;
import net.mcreator.doomsdaytechnology.procedures.FetchRF2Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft9Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft8Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft7Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft6Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft5Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft4Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft3Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft2Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft1Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft11Procedure;
import net.mcreator.doomsdaytechnology.procedures.Craft10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AlloyfurnaceguiScreen extends AbstractContainerScreen<AlloyfurnaceguiMenu> {
	private final static HashMap<String, Object> guistate = AlloyfurnaceguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlloyfurnaceguiScreen(AlloyfurnaceguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("doomsday_technology:textures/screens/alloyfurnacegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/rf_null.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 14, 50, 14, 50);

		RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead0.png"));
		this.blit(ms, this.leftPos + 84, this.topPos + 40, 0, 0, 24, 17, 24, 17);

		if (Craft1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 85, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 87, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 89, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 91, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 93, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 95, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead1.png"));
			this.blit(ms, this.leftPos + 97, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead2.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead3.png"));
			this.blit(ms, this.leftPos + 101, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead4.png"));
			this.blit(ms, this.leftPos + 103, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (Craft11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/arrowhead5.png"));
			this.blit(ms, this.leftPos + 105, this.topPos + 40, 0, 0, 2, 17, 2, 17);
		}
		if (RF1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 66, 0, 0, 12, 2, 12, 2);
		}
		if (RF2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 64, 0, 0, 12, 2, 12, 2);
		}
		if (RF3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 62, 0, 0, 12, 2, 12, 2);
		}
		if (RF4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 60, 0, 0, 12, 2, 12, 2);
		}
		if (RF5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 58, 0, 0, 12, 2, 12, 2);
		}
		if (RF6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 56, 0, 0, 12, 2, 12, 2);
		}
		if (RF7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 54, 0, 0, 12, 2, 12, 2);
		}
		if (RF8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 52, 0, 0, 12, 2, 12, 2);
		}
		if (RF9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 50, 0, 0, 12, 2, 12, 2);
		}
		if (RF10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 48, 0, 0, 12, 2, 12, 2);
		}
		if (RF11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 46, 0, 0, 12, 2, 12, 2);
		}
		if (RF12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 44, 0, 0, 12, 2, 12, 2);
		}
		if (RF13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 42, 0, 0, 12, 2, 12, 2);
		}
		if (RF14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 40, 0, 0, 12, 2, 12, 2);
		}
		if (RF15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 38, 0, 0, 12, 2, 12, 2);
		}
		if (RF16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 36, 0, 0, 12, 2, 12, 2);
		}
		if (RF17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 34, 0, 0, 12, 2, 12, 2);
		}
		if (RF18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 32, 0, 0, 12, 2, 12, 2);
		}
		if (RF19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 30, 0, 0, 12, 2, 12, 2);
		}
		if (RF20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 28, 0, 0, 12, 2, 12, 2);
		}
		if (RF21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 26, 0, 0, 12, 2, 12, 2);
		}
		if (RF22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 24, 0, 0, 12, 2, 12, 2);
		}
		if (RF23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 22, 0, 0, 12, 2, 12, 2);
		}
		if (RF24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("doomsday_technology:textures/screens/electricity.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 20, 0, 0, 12, 2, 12, 2);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				FetchRF2Procedure.execute(world, x, y, z), 6, 70, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.doomsday_technology.alloyfurnacegui.label_forging_press"), 6, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
