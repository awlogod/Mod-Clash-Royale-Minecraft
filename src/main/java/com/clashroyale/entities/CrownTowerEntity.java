package com.clashroyale.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class CrownTowerEntity extends LivingEntity {
    private int towerHealth = 2400;
    private String team = "player";

    public CrownTowerEntity(EntityType<? extends LivingEntity> type, Level level) {
        super(type, level);
    }

    public int getTowerHealth() {
        return towerHealth;
    }

    public void setTowerHealth(int health) {
        this.towerHealth = health;
        if (towerHealth <= 0) {
            this.remove(RemovalReason.KILLED);
        }
    }

    public void damageTower(int damage) {
        setTowerHealth(towerHealth - damage);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public Iterable<net.minecraft.world.item.ItemStack> getArmorSlots() {
        return java.util.Collections.emptyList();
    }

    @Override
    public net.minecraft.world.item.ItemStack getItemBySlot(net.minecraft.world.entity.EquipmentSlot slot) {
        return net.minecraft.world.item.ItemStack.EMPTY;
    }

    @Override
    public void setItemSlot(net.minecraft.world.entity.EquipmentSlot slot, net.minecraft.world.item.ItemStack stack) {
    }
}

