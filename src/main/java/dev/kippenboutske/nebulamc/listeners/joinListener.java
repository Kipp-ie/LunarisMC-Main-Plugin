package dev.kippenboutske.nebulamc.listeners;

import dev.kippenboutske.nebulamc.main;
import jdk.tools.jmod.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){


        main.createScoreBoard(e.getPlayer());
        e.getPlayer().sendTitle("Welcome in NebulaMC!", "TESTTESTETTSTSTST", 1, 20 ,1);


    }

}
