package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class PrinceEntity extends BaseTroopEntity {
    public PrinceEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 1100;
        this.damage = 325;
        this.speed = 0.7;
    }
}

