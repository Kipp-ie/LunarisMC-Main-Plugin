package dev.kippenboutske.lunarismc;

import dev.kippenboutske.lunarismc.listeners.TabListListener;
import dev.kippenboutske.lunarismc.listeners.joinListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            Bukkit.getLogger().info("██╗░░░░░██╗░░░██╗███╗░░██╗░█████╗░██████╗░██╗░██████╗███╗░░░███╗░█████╗░");
            Bukkit.getLogger().info("██║░░░░░██║░░░██║████╗░██║██╔══██╗██╔══██╗██║██╔════╝████╗░████║██╔══██╗");
            Bukkit.getLogger().info("██║░░░░░██║░░░██║██╔██╗██║███████║██████╔╝██║╚█████╗░██╔████╔██║██║░░╚═╝");
            Bukkit.getLogger().info("██║░░░░░██║░░░██║██║╚████║██╔══██║██╔══██╗██║░╚═══██╗██║╚██╔╝██║██║░░██╗");
            Bukkit.getLogger().info("███████╗╚██████╔╝██║░╚███║██║░░██║██║░░██║██║██████╔╝██║░╚═╝░██║╚█████╔╝");
            Bukkit.getLogger().info("╚══════╝░╚═════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═════╝░╚═╝░░░░░╚═╝░╚════╝░");
            getCommand("broadcast").setExecutor(new Broadcast());
            Bukkit.getPluginManager().registerEvents(new joinListener(), this);
            Bukkit.getPluginManager().registerEvents(new TabListListener(), this);

        } else {
            Bukkit.getLogger().warning("Could not find PlaceholderAPI! This plugin is required.");
            Bukkit.getLogger().warning("Disabling plugin now...");
            Bukkit.getPluginManager().disablePlugin(this);
        }


    }

    public static void createScoreBoard(Player player){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();

        Objective objective = scoreboard.registerNewObjective("lunarismcboard", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(ChatColor.DARK_PURPLE + "TEST BORD");

        Score emptyLine = objective.getScore(" ");
        emptyLine.setScore(10);
        Score playerName = objective.getScore(ChatColor.AQUA + "Naam:" + player.getDisplayName());
        playerName.setScore(9);

        player.setScoreboard(scoreboard);



    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
