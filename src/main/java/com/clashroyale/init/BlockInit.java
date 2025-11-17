package com.clashroyale.init;

import com.clashroyale.ClashRoyaleMod;
import com.clashroyale.blocks.ArenaBlock;
import com.clashroyale.blocks.CrownTowerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, ClashRoyaleMod.MODID);

    public static final RegistryObject<Block> ARENA_BLOCK = BLOCKS.register("arena_block",
        () -> new ArenaBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3.0f, 10.0f)
            .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CROWN_TOWER = BLOCKS.register("crown_tower",
        () -> new CrownTowerBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(50.0f, 200.0f)
            .requiresCorrectToolForDrops()));
}

