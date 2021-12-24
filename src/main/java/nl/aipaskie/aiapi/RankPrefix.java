package nl.aipaskie.aiapi;

import com.nametagedit.plugin.NametagEdit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class RankPrefix implements Listener {




    // STAFF
    String owner = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Owner" + ChatColor.WHITE + "] "  ;
    String dev = ChatColor.WHITE + "[" + ChatColor.RED + "Dev" + ChatColor.WHITE + "] "  ;
    String admin = ChatColor.WHITE + "[" + ChatColor.RED + "Admin" + ChatColor.WHITE + "] "  ;
    String mod = ChatColor.WHITE + "[" + ChatColor.RED + "Mod" + ChatColor.WHITE + "] "  ;
    String helper = ChatColor.WHITE + "[" + ChatColor.GREEN + "Helper" + ChatColor.WHITE + "] "  ;
    String builder = ChatColor.WHITE + "[" + ChatColor.GREEN + "Builder" + ChatColor.WHITE + "] "  ;
    // SOCIAL
    String twitch = ChatColor.WHITE + "[" + ChatColor.DARK_PURPLE + "Twitch" + ChatColor.WHITE + "] "  ;
    String youtube = ChatColor.WHITE + "[" + ChatColor.RED + "Youtube" + ChatColor.WHITE+ "] "  ;
    // RANK
    String mvp2 = ChatColor.GRAY + "[" + ChatColor.BLUE + "MVP" + ChatColor.RED + "+" + ChatColor.GRAY + "] "  ;
    String mvp = ChatColor.GRAY + "[" + ChatColor.DARK_AQUA + "MVP" + ChatColor.GRAY + "] "  ;
    String vip = ChatColor.GRAY + "[" + ChatColor.GREEN + "VIP" + ChatColor.GRAY + "] "  ;

    @EventHandler
    public void playerJoin(PlayerJoinEvent e){
        // STAFF
        if(e.getPlayer().hasPermission("aipaskie.owner")){
            e.getPlayer().setDisplayName(owner + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(owner + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), owner);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.admin")){
            e.getPlayer().setDisplayName(admin + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(admin + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), admin);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.mod")){
            e.getPlayer().setDisplayName(mod + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(mod + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), mod);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.helper")){
            e.getPlayer().setDisplayName(helper + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(helper + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), helper);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.builder")){
            e.getPlayer().setDisplayName(builder + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(builder + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), builder);
            return;
        }
        // SOCIAL
        else if(e.getPlayer().hasPermission("aipaskie.twitch")){
            e.getPlayer().setDisplayName(twitch + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(twitch + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), twitch);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.youtube")){
            e.getPlayer().setDisplayName(youtube + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(youtube + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), youtube);
            return;
        }
        // staff
        else if(e.getPlayer().hasPermission("aipaskie.mvp2")){
            e.getPlayer().setDisplayName(mvp2 + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(mvp2 + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), mvp2);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.mvp")){
            e.getPlayer().setDisplayName(mvp + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(mvp + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), mvp);
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.vip")){
            e.getPlayer().setDisplayName(vip + e.getPlayer().getName());
            e.getPlayer().setPlayerListName(vip + e.getPlayer().getName());
            NametagEdit.getApi().setPrefix(e.getPlayer(), vip);
            return;
        }
    }

    @EventHandler
    public void playerChat(AsyncPlayerChatEvent e){
        // STAFF
        if(e.getPlayer().hasPermission("aipaskie.owner")){
            e.setFormat(owner + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.admin")){
            e.setFormat(admin + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.mod")){
            e.setFormat(mod + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.helper")){
            e.setFormat(helper + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.builder")){
            e.setFormat(builder + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        }
        // SOCIAL
        else if(e.getPlayer().hasPermission("aipaskie.twitch")){
            e.setFormat(twitch + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.youtube")){
            e.setFormat(youtube + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        }
        // staff
        else if(e.getPlayer().hasPermission("aipaskie.mvp2")){
            e.setFormat(mvp2 + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.mvp")){
            e.setFormat(mvp + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else if(e.getPlayer().hasPermission("aipaskie.vip")){
            e.setFormat(vip + e.getPlayer().getName() + ": " + e.getMessage());
            return;
        } else {
            e.setFormat( ChatColor.GRAY + e.getPlayer().getName() + ": " + e.getMessage());
        }
    }
}
