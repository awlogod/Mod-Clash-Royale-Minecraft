package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class BaseTroopEntity extends Monster {
    protected int health;
    protected int damage;
    protected double speed;
    protected String team; // "player" ou "enemy"

    public BaseTroopEntity(EntityType<? extends Monster> type, Level level) {
        super(type, level);
        this.team = "player";
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        
        // Ataca apenas inimigos do time oposto
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, 
            BaseTroopEntity.class, true, entity -> {
                if (entity instanceof BaseTroopEntity troop) {
                    return !this.team.equals(troop.getTeam());
                }
                return false;
            }));
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getTroopHealth() {
        return health;
    }

    public void setTroopHealth(int health) {
        this.health = health;
    }

    public int getTroopDamage() {
        return damage;
    }

    public void setTroopDamage(int damage) {
        this.damage = damage;
    }
}

