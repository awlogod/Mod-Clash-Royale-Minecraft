package com.clashroyale.client.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import com.clashroyale.ClashRoyaleMod;

public class ArenaGUI extends Screen {
    private static final ResourceLocation ARENA_TEXTURE = 
        new ResourceLocation(ClashRoyaleMod.MODID, "textures/gui/arena.png");

    public ArenaGUI() {
        super(Component.literal("Arena Clash Royale"));
    }

    @Override
    protected void init() {
        super.init();
        // Adiciona botões e elementos da GUI aqui
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(poseStack);
        drawCenteredString(poseStack, this.font, "Arena Clash Royale", 
            this.width / 2, 20, 0xFFFFFF);
        super.render(poseStack, mouseX, mouseY, partialTick);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void onClose() {
        super.onClose();
    }
}

