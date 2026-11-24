package me.biggie.biggiesPlugin.listeners;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.awt.*;

public class Teleportation implements Listener {
    @EventHandler
    public void onTeleport(PlayerTeleportEvent e){
        Player player = e.getPlayer();
        if (e.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL){
            e.setCancelled(true);
            player.sendMessage(Component.text("You cannot use ender pearls!")
                    .color(NamedTextColor.RED));
        player.playSound(e.getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 1.0f, 1.0f);
        }



    }

}
