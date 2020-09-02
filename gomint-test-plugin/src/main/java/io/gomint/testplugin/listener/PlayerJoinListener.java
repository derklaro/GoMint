package io.gomint.testplugin.listener;

import io.gomint.entity.passive.EntitySheep;
import io.gomint.event.EventHandler;
import io.gomint.event.EventListener;
import io.gomint.event.EventPriority;
import io.gomint.event.player.PlayerJoinEvent;
import io.gomint.inventory.item.ItemFlintAndSteel;
import io.gomint.testplugin.TestPlugin;
import io.gomint.testplugin.scoreboard.DebugScoreboard;

/**
 * @author geNAZt
 * @version 1.0
 */
public class PlayerJoinListener implements EventListener {

    private final TestPlugin plugin;

    public PlayerJoinListener(TestPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Set to allow all permissions
        event.getPlayer().getPermissionManager().setPermission("*", true);

        // Give this player the debug scoreboard
        new DebugScoreboard(this.plugin, event.getPlayer());

        event.getPlayer().getInventory().setItem(6, ItemFlintAndSteel.create(1));
    }

}
