package dev.kippenboutske.nebulamc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Lock implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = Bukkit.getPlayer(args[0]);
        if(player != null)
        {
            sender.sendMessage(args + "has been locked, don't forget to unlock!");
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1000000, true, false));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 1, true, false));
            player.sendTitle("You have been locked", "Don't logout!");
        }
        else
        {
            player.sendMessage("Player "+args[0]+" is not online");
        }







        return true;
    }
}
