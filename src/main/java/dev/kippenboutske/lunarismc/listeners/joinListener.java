package dev.kippenboutske.lunarismc.listeners;

import dev.kippenboutske.lunarismc.main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        main.createScoreBoard(e.getPlayer());
        e.getPlayer().sendTitle("[lang]title.welcome[/lang]", "BLABLABLA");
        e.setJoinMessage(ChatColor.GRAY + "[ų] " + e.getPlayer().getDisplayName());
        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 5);
    }
    public void onLeave(PlayerQuitEvent e) {
        e.setQuitMessage(ChatColor.GRAY + "[ť] " + e.getPlayer().getDisplayName());
    }

}
