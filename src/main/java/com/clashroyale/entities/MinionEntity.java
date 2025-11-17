package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class MinionEntity extends BaseTroopEntity {
    public MinionEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 190;
        this.damage = 40;
        this.speed = 0.9;
    }
}

