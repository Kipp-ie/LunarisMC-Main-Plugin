
package dev.kippenboutske.lunarismc;

        import org.bukkit.Bukkit;
        import org.bukkit.ChatColor;
        import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;

        import static net.md_5.bungee.api.ChatColor.translateAlternateColorCodes;

public class Broadcast implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String message = "";
        for (String part : args) {
            if (message != "") message += " ";
            message += part;
        }
        Bukkit.broadcastMessage(ChatColor.BLUE + "----------" + translateAlternateColorCodes('§', "§x§0§0§F§F§E§0lL§x§0§2§D§F§E§4lu§x§0§4§B§F§E§8ln§x§0§6§9§F§E§Cla§x§0§8§8§0§F§0lr§x§0§A§6§0§F§3li§x§0§C§4§0§F§7ls§x§0§E§2§0§F§BlM§x§1§0§0§0§F§FlC") + ChatColor.BLUE + "----------");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage(message);
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage( ChatColor.BLUE + "-----------------------------");
        return true;
    }

}

