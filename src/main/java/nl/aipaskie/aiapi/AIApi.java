package nl.aipaskie.aiapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class AIApi extends JavaPlugin {

    public AIPlayer aiPlayer;
    public MessageType messageType;

    @Override
    public void onEnable() {
        aiPlayer = new AIPlayer();
        messageType = new MessageType();
    }

    @Override
    public void onDisable() {

    }
}
