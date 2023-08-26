package dev.kippenboutske.nebulamc.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TabListListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        player.setPlayerListHeader(ChatColor.RED + "WELKOM\n" + ChatColor.GREEN + player.getDisplayName() + "\n");
        player.setPlayerListFooter(ChatColor.GOLD + "FOOTER");

    }
}
