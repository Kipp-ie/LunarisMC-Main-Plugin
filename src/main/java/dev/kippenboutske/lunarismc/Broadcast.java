
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
        Bukkit.broadcastMessage(ChatColor.BLUE + "----------" + translateAlternateColorCodes('§', "§x§0§0§F§F§E§0&lL§x§0§2§D§F§E§4&lu§x§0§4§B§F§E§8&ln§x§0§6§9§F§E§C&la§x§0§8§8§0§F§0&lr§x§0§A§6§0§F§3&li§x§0§C§4§0§F§7&ls§x§0§E§2§0§F§B&lM§x§1§0§0§0§F§F&lC") + ChatColor.BLUE + "----------");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage(message);
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage( ChatColor.BLUE + "-----------------------------");
        return true;
    }

}

