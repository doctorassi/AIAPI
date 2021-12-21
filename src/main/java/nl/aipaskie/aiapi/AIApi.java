package nl.aipaskie.aiapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AIApi extends JavaPlugin {

    public AIPlayer aiPlayer;
    public MessageType messageType;
    private Connection connection;
    public String host, database, username, password, table;
    public int port;

    @Override
    public void onEnable() {
        aiPlayer = new AIPlayer(this);
        messageType = new MessageType(this);
        loadConfig();
        mysqlSetup();
    }

    @Override
    public void onDisable() {

    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void mysqlSetup(){
        host = "localhost";
        port = 3306;
        database = "playerdata";
        username = "root";
        password = "pupu";

        try{

            synchronized (this){
                if(getConnection() != null && !getConnection().isClosed()){
                    return;
                }

                Class.forName("com.mysql.jdbc.Driver");
                setConnection( DriverManager.getConnection("jdbc:mysql://" + this.host + ":"
                        + this.port + "/" + this.database + "?characterEncoding=utf8", this.username, this.password));

                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "MYSQL CONNECTED");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


}
