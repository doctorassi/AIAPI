package nl.aipaskie.aiapi;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class AIPlayer {

    private AIApi plugin;

    public AIPlayer(AIApi plugin){
        this.plugin = plugin;
    }

    public Money money;

    // Gamemode
    public static String getGamemode(Player player){
        return player.getGameMode().name();
    }
    public static void setGamemode(Player p, GameMode gamemode){
        p.setGameMode(gamemode);
    }
    //Health
    public void heal(Player p){
        p.setHealth(20);
        p.setFoodLevel(20);
        for (PotionEffect e : p.getActivePotionEffects()){
            p.removePotionEffect(e.getType());
        }
    }
    public void setFood(Player p, int i){
        p.setFoodLevel(i);
    }
    public int getFood(Player p){
        return p.getFoodLevel();
    }
    public void setHealth(Player p, int i){
        p.setHealth(i);
    }
    public double getHealth(Player p) {
        return p.getHealth();
    }
    public void setMaxHealth(Player p, int i){
        p.setMaxHealth(i);
    }
    public double getMaxHealth(Player p){
        return p.getMaxHealth();
    }
}