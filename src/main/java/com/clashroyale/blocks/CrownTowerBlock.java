package com.clashroyale.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import com.clashroyale.entities.CrownTowerEntity;

public class CrownTowerBlock extends Block {
    public CrownTowerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide) {
            // Cria uma entidade de torre quando o bloco é colocado
            CrownTowerEntity tower = new CrownTowerEntity(EntityInit.CROWN_TOWER.get(), level);
            tower.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
            level.addFreshEntity(tower);
        }
        super.onPlace(state, level, pos, oldState, isMoving);
    }
}

