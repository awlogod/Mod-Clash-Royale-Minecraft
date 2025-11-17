package com.clashroyale;

import com.clashroyale.init.EntityInit;
import com.clashroyale.init.ItemInit;
import com.clashroyale.init.BlockInit;
import com.clashroyale.network.NetworkHandler;
import com.clashroyale.commands.ClashRoyaleCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ClashRoyaleMod.MODID)
public class ClashRoyaleMod {
    public static final String MODID = "clashroyale";
    public static final Logger LOGGER = LogManager.getLogger();

    public ClashRoyaleMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Registra os itens, blocos e entidades
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EntityInit.ENTITIES.register(modEventBus);
        
        modEventBus.addListener(this::setup);
        
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            NetworkHandler.register();
            LOGGER.info("Clash Royale Mod carregado com sucesso!");
        });
    }

    private void registerCommands(RegisterCommandsEvent event) {
        ClashRoyaleCommand.register(event.getDispatcher());
    }
}

