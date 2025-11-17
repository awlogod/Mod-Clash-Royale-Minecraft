package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class ArcherEntity extends BaseTroopEntity {
    public ArcherEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 125;
        this.damage = 50;
        this.speed = 0.6;
    }
}

