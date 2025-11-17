package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class PekkaEntity extends BaseTroopEntity {
    public PekkaEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 2600;
        this.damage = 600;
        this.speed = 0.5;
    }
}

