package com.clashroyale.client.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class CardSelectionScreen extends Screen {
    public CardSelectionScreen() {
        super(Component.literal("Seleção de Cartas"));
    }

    @Override
    protected void init() {
        super.init();
        // Adiciona botões para selecionar cartas
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(poseStack);
        drawCenteredString(poseStack, this.font, "Selecione uma Carta", 
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

