package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class KnightEntity extends BaseTroopEntity {
    public KnightEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 660;
        this.damage = 75;
        this.speed = 0.6;
    }
}

