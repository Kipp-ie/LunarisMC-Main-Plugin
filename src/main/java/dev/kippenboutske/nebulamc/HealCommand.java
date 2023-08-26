package dev.kippenboutske.nebulamc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;

            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN + "Jouw health is bijgevult!");

        } else {
            Bukkit.getLogger().info("Je bent geen speler!");
        }
        return false;
    }
}
