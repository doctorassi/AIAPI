package nl.aipaskie.aiapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageType{

    private static String discordLink;

    public static void NOTICE(Player p, String s){
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "NOTICE" + ChatColor.WHITE + "] " + s);
    }
     public static void SERVER(Player p, String s) {
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "SERVER" + ChatColor.WHITE + "] " + s);
    }
    public static void WARNING(Player p , String s){
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + "WARNING" + ChatColor.WHITE + "] " + s);
    }
    public static void AIPVP(Player p , String s){
        p.sendMessage(ChatColor.YELLOW + "[" + ChatColor.RED + "AI PVP" + ChatColor.YELLOW + "] " + ChatColor.WHITE + s);
    }
    public static void BROADCAST (String s){
        Bukkit.broadcastMessage(ChatColor.YELLOW + "[" + ChatColor.RED + "SERVER" + ChatColor.YELLOW + "] " + ChatColor.WHITE + s);
    }
    public static void firstJoin(Player p){
        BROADCAST(ChatColor.AQUA + p.getName() + ChatColor.WHITE + " Has joineed the server for the first time!");
        p.sendMessage(ChatColor.YELLOW + "Welcome to the " +ChatColor.RED +  "AIPVP Network!");
        p.sendMessage(ChatColor.YELLOW + "do /intro to do a tour about this network!");
        p.sendMessage(ChatColor.YELLOW + "We wish u a nice pvp experience!");
    }
}
