package com.clashroyale.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.client.Minecraft;
import com.clashroyale.client.gui.CardSelectionScreen;

public class CardItem extends Item {
    private final String troopType;
    private final int elixirCost;

    public CardItem(Properties properties, String troopType, int elixirCost) {
        super(properties);
        this.troopType = troopType;
        this.elixirCost = elixirCost;
    }

    public String getTroopType() {
        return troopType;
    }

    public int getElixirCost() {
        return elixirCost;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide) {
            openCardSelectionGUI();
        }
        return super.use(level, player, hand);
    }

    @OnlyIn(Dist.CLIENT)
    private void openCardSelectionGUI() {
        Minecraft.getInstance().setScreen(new CardSelectionScreen());
    }
}

