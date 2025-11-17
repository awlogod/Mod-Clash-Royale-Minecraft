package com.clashroyale.game;

import com.clashroyale.entities.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import java.util.ArrayList;
import java.util.List;

public class ArenaManager {
    private static ArenaManager instance;
    private List<BaseTroopEntity> playerTroops = new ArrayList<>();
    private List<BaseTroopEntity> enemyTroops = new ArrayList<>();
    private List<CrownTowerEntity> playerTowers = new ArrayList<>();
    private List<CrownTowerEntity> enemyTowers = new ArrayList<>();
    private boolean gameActive = false;
    private BlockPos arenaCenter;

    public static ArenaManager getInstance() {
        if (instance == null) {
            instance = new ArenaManager();
        }
        return instance;
    }

    public void startGame(Level level, BlockPos center) {
        this.arenaCenter = center;
        this.gameActive = true;
        // Cria as torres iniciais
        createTowers(level, center);
    }

    private void createTowers(Level level, BlockPos center) {
        // Cria 3 torres do jogador (2 laterais + 1 central)
        // Cria 3 torres do inimigo
        // Implementação simplificada
    }

    public void spawnTroop(Level level, String troopType, BlockPos position, String team) {
        BaseTroopEntity troop = createTroopEntity(level, troopType);
        if (troop != null) {
            troop.setPos(position.getX(), position.getY(), position.getZ());
            troop.setTeam(team);
            level.addFreshEntity(troop);
            
            if (team.equals("player")) {
                playerTroops.add(troop);
            } else {
                enemyTroops.add(troop);
            }
        }
    }

    private BaseTroopEntity createTroopEntity(Level level, String troopType) {
        return switch (troopType) {
            case "archer" -> new ArcherEntity(com.clashroyale.init.EntityInit.ARCHER.get(), level);
            case "giant" -> new GiantEntity(com.clashroyale.init.EntityInit.GIANT.get(), level);
            case "goblin" -> new GoblinEntity(com.clashroyale.init.EntityInit.GOBLIN.get(), level);
            case "knight" -> new KnightEntity(com.clashroyale.init.EntityInit.KNIGHT.get(), level);
            case "prince" -> new PrinceEntity(com.clashroyale.init.EntityInit.PRINCE.get(), level);
            case "wizard" -> new WizardEntity(com.clashroyale.init.EntityInit.WIZARD.get(), level);
            case "pekka" -> new PekkaEntity(com.clashroyale.init.EntityInit.PEKKA.get(), level);
            case "minion" -> new MinionEntity(com.clashroyale.init.EntityInit.MINION.get(), level);
            default -> null;
        };
    }

    public boolean isGameActive() {
        return gameActive;
    }

    public void endGame() {
        gameActive = false;
        playerTroops.clear();
        enemyTroops.clear();
        playerTowers.clear();
        enemyTowers.clear();
    }

    public BlockPos getArenaCenter() {
        return arenaCenter;
    }
}

