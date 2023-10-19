package dev.kippenboutske.lunarismc.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TabListListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        player.setPlayerListHeader(ChatColor.WHITE + "\n" + "          œ          " + "\n\n" + ChatColor.LIGHT_PURPLE + "--------------");
        player.setPlayerListFooter(ChatColor.WHITE + "\n" + "Hello " + ChatColor.LIGHT_PURPLE + player.getName() + "!" + "\n" + ChatColor.WHITE + "TPS: " + ChatColor.LIGHT_PURPLE + Bukkit.getTPS());

    }
}
