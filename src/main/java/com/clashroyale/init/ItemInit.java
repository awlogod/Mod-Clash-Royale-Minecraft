package com.clashroyale.init;

import com.clashroyale.ClashRoyaleMod;
import com.clashroyale.items.CardItem;
import com.clashroyale.items.ElixirItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, ClashRoyaleMod.MODID);

    // Cartas de tropas
    public static final RegistryObject<Item> CARD_ARCHER = ITEMS.register("card_archer",
        () -> new CardItem(new Item.Properties().stacksTo(1), "archer", 3));
    
    public static final RegistryObject<Item> CARD_GIANT = ITEMS.register("card_giant",
        () -> new CardItem(new Item.Properties().stacksTo(1), "giant", 5));
    
    public static final RegistryObject<Item> CARD_GOBLIN = ITEMS.register("card_goblin",
        () -> new CardItem(new Item.Properties().stacksTo(1), "goblin", 2));
    
    public static final RegistryObject<Item> CARD_KNIGHT = ITEMS.register("card_knight",
        () -> new CardItem(new Item.Properties().stacksTo(1), "knight", 3));
    
    public static final RegistryObject<Item> CARD_PRINCE = ITEMS.register("card_prince",
        () -> new CardItem(new Item.Properties().stacksTo(1), "prince", 5));
    
    public static final RegistryObject<Item> CARD_WIZARD = ITEMS.register("card_wizard",
        () -> new CardItem(new Item.Properties().stacksTo(1), "wizard", 5));
    
    public static final RegistryObject<Item> CARD_PEKKA = ITEMS.register("card_pekka",
        () -> new CardItem(new Item.Properties().stacksTo(1), "pekka", 7));
    
    public static final RegistryObject<Item> CARD_MINION = ITEMS.register("card_minion",
        () -> new CardItem(new Item.Properties().stacksTo(1), "minion", 3));

    // Elixir
    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir",
        () -> new ElixirItem(new Item.Properties().stacksTo(10)));
}

