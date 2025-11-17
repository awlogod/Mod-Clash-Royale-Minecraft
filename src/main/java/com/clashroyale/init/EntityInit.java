package com.clashroyale.init;

import com.clashroyale.ClashRoyaleMod;
import com.clashroyale.entities.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = 
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ClashRoyaleMod.MODID);

    // Tropas
    public static final RegistryObject<EntityType<ArcherEntity>> ARCHER = ENTITIES.register("archer",
        () -> EntityType.Builder.of(ArcherEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.8f)
            .build("archer"));

    public static final RegistryObject<EntityType<GiantEntity>> GIANT = ENTITIES.register("giant",
        () -> EntityType.Builder.of(GiantEntity::new, MobCategory.MONSTER)
            .sized(1.2f, 3.0f)
            .build("giant"));

    public static final RegistryObject<EntityType<GoblinEntity>> GOBLIN = ENTITIES.register("goblin",
        () -> EntityType.Builder.of(GoblinEntity::new, MobCategory.MONSTER)
            .sized(0.5f, 1.2f)
            .build("goblin"));

    public static final RegistryObject<EntityType<KnightEntity>> KNIGHT = ENTITIES.register("knight",
        () -> EntityType.Builder.of(KnightEntity::new, MobCategory.MONSTER)
            .sized(0.7f, 1.9f)
            .build("knight"));

    public static final RegistryObject<EntityType<PrinceEntity>> PRINCE = ENTITIES.register("prince",
        () -> EntityType.Builder.of(PrinceEntity::new, MobCategory.MONSTER)
            .sized(0.8f, 2.0f)
            .build("prince"));

    public static final RegistryObject<EntityType<WizardEntity>> WIZARD = ENTITIES.register("wizard",
        () -> EntityType.Builder.of(WizardEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.8f)
            .build("wizard"));

    public static final RegistryObject<EntityType<PekkaEntity>> PEKKA = ENTITIES.register("pekka",
        () -> EntityType.Builder.of(PekkaEntity::new, MobCategory.MONSTER)
            .sized(1.0f, 2.5f)
            .build("pekka"));

    public static final RegistryObject<EntityType<MinionEntity>> MINION = ENTITIES.register("minion",
        () -> EntityType.Builder.of(MinionEntity::new, MobCategory.MONSTER)
            .sized(0.5f, 1.0f)
            .build("minion"));

    // Torres
    public static final RegistryObject<EntityType<CrownTowerEntity>> CROWN_TOWER = ENTITIES.register("crown_tower",
        () -> EntityType.Builder.of(CrownTowerEntity::new, MobCategory.MISC)
            .sized(1.5f, 4.0f)
            .build("crown_tower"));
}

