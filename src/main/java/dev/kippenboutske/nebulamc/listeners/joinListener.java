package dev.kippenboutske.nebulamc.listeners;

import dev.kippenboutske.nebulamc.main;
import jdk.tools.jmod.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

public class joinListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        main.createScoreBoard(e.getPlayer());
        e.getPlayer().sendTitle("[lang]title.welcome[/lang]", "BLABLABLA");
        e.setJoinMessage(ChatColor.GRAY + "[ų] " + e.getPlayer().getDisplayName());
    }
    public void onLeave(PlayerQuitEvent e) {
        e.setQuitMessage(ChatColor.GRAY + "[ť] " + e.getPlayer().getDisplayName());
    }

}
