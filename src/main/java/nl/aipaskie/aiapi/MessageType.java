package nl.aipaskie.aiapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageType{

    public String discordLink = "Test";
    private AIApi plugin = AIApi.getPlugin(AIApi.class);

    public void NOTICE(Player p, String s){
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "NOTICE" + ChatColor.WHITE + "] " + s);
    }
    public void SERVER(Player player, String s) {
        Player p = Bukkit.getPlayer(player.getUniqueId());
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "SERVER " + ChatColor.WHITE + "] " + s);;
    }
    public void WARNING(Player p , String s){
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "WARNING " + ChatColor.WHITE + "] " + s);
    }
    public  void AIPVP(Player p , String s){
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "PVP" + ChatColor.WHITE + "] " + s);
    }
    public void BROADCAST (String s){
        Bukkit.broadcastMessage(ChatColor.YELLOW + "[" + ChatColor.RED + "SERVER" + ChatColor.YELLOW + "] " + ChatColor.WHITE + s);
    }
    public void firstJoin(Player player){
        Player p = Bukkit.getPlayer(player.getUniqueId());
        //BROADCAST(ChatColor.AQUA + p.getName() + ChatColor.WHITE + " Has joineed the server for the first time!");
        p.sendMessage("Welcome to the AIPVP server!");
        p.sendMessage("do /intro to do a tour about this network!");
        p.sendMessage("Discord: " + discordLink);
        p.sendMessage("We wish u a nice pvp experience!");
    }
}
