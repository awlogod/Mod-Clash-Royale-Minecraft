package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class GiantEntity extends BaseTroopEntity {
    public GiantEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 2000;
        this.damage = 150;
        this.speed = 0.4;
    }
}

