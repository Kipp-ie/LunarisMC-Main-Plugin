
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
        Bukkit.broadcastMessage(translateAlternateColorCodes('§', "§x§B§E§0§0§F§FN§x§A§3§0§0§F§Fe§x§8§9§0§0§F§Fb§x§6§E§0§0§F§Fu§x§5§3§0§0§F§Fl§x§3§8§0§0§F§Fa§x§1§E§0§0§F§FM§x§0§3§0§0§F§FC") + ChatColor.RESET + " " + translateAlternateColorCodes('&', message));
        return true;
    }

}

