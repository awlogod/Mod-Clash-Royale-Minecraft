package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class WizardEntity extends BaseTroopEntity {
    public WizardEntity(EntityType<? extends BaseTroopEntity> type, Level level) {
        super(type, level);
        this.health = 340;
        this.damage = 130;
        this.speed = 0.5;
    }
}

