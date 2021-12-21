package nl.aipaskie.aiapi;

import org.bukkit.entity.Player;

public class Tokens {

    interface NetworkToken{
        static void getBalance(Player p){

        }
        static void addBalance(Player p, int amount){

        }
        static void setBalance(Player p, int amount){

        }
        static void removeBalance(Player p, int amount){

        }
    }

    interface SkyPVPToken{
        static void getBalance(Player p){

        }
        static void addBalance(Player p, int amount){

        }
        static void setBalance(Player p, int amount){

        }
        static void removeBalance(Player p, int amount){

        }
    }


}
