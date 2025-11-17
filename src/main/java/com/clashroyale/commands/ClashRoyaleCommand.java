package com.clashroyale.commands;

import com.clashroyale.game.ArenaManager;
import com.clashroyale.game.ElixirManager;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class ClashRoyaleCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("clashroyale")
            .then(Commands.literal("start")
                .executes(context -> {
                    CommandSourceStack source = context.getSource();
                    if (source.getEntity() instanceof ServerPlayer player) {
                        BlockPos pos = player.blockPosition();
                        ArenaManager.getInstance().startGame(player.level, pos);
                        source.sendSuccess(() -> Component.literal("Arena Clash Royale iniciada!"), true);
                        return 1;
                    }
                    return 0;
                }))
            .then(Commands.literal("elixir")
                .executes(context -> {
                    CommandSourceStack source = context.getSource();
                    ElixirManager elixir = new ElixirManager();
                    source.sendSuccess(() -> Component.literal("Elixir: " + elixir.getCurrentElixirInt() + "/10"), true);
                    return 1;
                }))
            .then(Commands.literal("spawn")
                .then(Commands.argument("troop", StringArgumentType.string())
                    .executes(context -> {
                        CommandSourceStack source = context.getSource();
                        String troopType = StringArgumentType.getString(context, "troop");
                        if (source.getEntity() instanceof ServerPlayer player) {
                            BlockPos pos = player.blockPosition();
                            ArenaManager.getInstance().spawnTroop(player.level, troopType, pos, "player");
                            source.sendSuccess(() -> Component.literal("Tropa " + troopType + " spawnada!"), true);
                            return 1;
                        }
                        return 0;
                    })))
            .then(Commands.literal("stop")
                .executes(context -> {
                    CommandSourceStack source = context.getSource();
                    ArenaManager.getInstance().endGame();
                    source.sendSuccess(() -> Component.literal("Jogo encerrado!"), true);
                    return 1;
                }))
        );
    }
}

