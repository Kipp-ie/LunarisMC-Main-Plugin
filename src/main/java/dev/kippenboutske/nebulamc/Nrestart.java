package dev.kippenboutske.nebulamc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Nrestart implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Bukkit.broadcastMessage("TEST MESSAGE 5");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage("TEST MESSAGE AFTER 5");

        Bukkit.spigot().restart();



        return true;
    }
}
