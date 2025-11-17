package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class GoblinEntity extends BaseTroopEntity {
    public GoblinEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 80;
        this.damage = 75;
        this.speed = 0.8;
    }
}

