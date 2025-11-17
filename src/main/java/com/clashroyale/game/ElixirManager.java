package com.clashroyale.game;

import net.minecraft.world.entity.player.Player;

public class ElixirManager {
    private static final int MAX_ELIXIR = 10;
    private static final double ELIXIR_REGEN_RATE = 0.02; // Elixir por tick
    
    private double currentElixir = 5.0; // Começa com 5 elixir
    private long lastUpdateTick = 0;

    public double getCurrentElixir() {
        return currentElixir;
    }

    public int getCurrentElixirInt() {
        return (int) Math.floor(currentElixir);
    }

    public boolean canAfford(int cost) {
        return currentElixir >= cost;
    }

    public boolean spendElixir(int amount) {
        if (canAfford(amount)) {
            currentElixir -= amount;
            return true;
        }
        return false;
    }

    public void update(long currentTick) {
        if (currentTick > lastUpdateTick) {
            // Regenera elixir até o máximo
            if (currentElixir < MAX_ELIXIR) {
                currentElixir = Math.min(MAX_ELIXIR, currentElixir + ELIXIR_REGEN_RATE);
            }
            lastUpdateTick = currentTick;
        }
    }

    public void reset() {
        currentElixir = 5.0;
        lastUpdateTick = 0;
    }
}

