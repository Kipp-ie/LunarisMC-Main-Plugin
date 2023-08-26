package dev.kippenboutske.nebulamc;

import dev.kippenboutske.nebulamc.listeners.TabListListener;
import dev.kippenboutske.nebulamc.listeners.joinListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("NebulaPlugin has been loaded");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("broadcast").setExecutor(new Broadcast());
        Bukkit.getPluginManager().registerEvents(new joinListener(), this);
        Bukkit.getPluginManager().registerEvents(new TabListListener(), this);

    }

    public static void createScoreBoard(Player player){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();

        Objective objective = scoreboard.registerNewObjective("nebulamcboard", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(ChatColor.DARK_PURPLE + "TEST BORD");

        Score emptyLine = objective.getScore(" ");
        emptyLine.setScore(10);
        Score playerName = objective.getScore(ChatColor.AQUA + "Naam:" + player.getDisplayName());
        playerName.setScore(9);

        player.setScoreboard(scoreboard);



    }
    public static void createTabList(Player player){

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
