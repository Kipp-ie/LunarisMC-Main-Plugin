package dev.kippenboutske.nebulamc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Unlock implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = Bukkit.getPlayer(args[0]);
        if(player != null)
        {
            sender.sendMessage(args + "has been unlocked!");
            player.removePotionEffect(PotionEffectType.BLINDNESS);
            player.removePotionEffect(PotionEffectType.SLOW);

            player.sendTitle("You have been unlocked", "Thanks for cooperating!");
        }
        else
        {
            player.sendMessage("Player "+args[0]+" is not online");
        }







        return true;
    }
}
