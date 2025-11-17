package com.clashroyale.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.loading.FMLEnvironment;
import com.clashroyale.client.gui.ArenaGUI;
import net.minecraft.client.Minecraft;

public class ArenaBlock extends Block {
    public ArenaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, 
                                  InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide && FMLEnvironment.dist.isClient()) {
            openArenaGUI();
        }
        return InteractionResult.SUCCESS;
    }

    @OnlyIn(Dist.CLIENT)
    private void openArenaGUI() {
        Minecraft.getInstance().setScreen(new ArenaGUI());
    }
}

