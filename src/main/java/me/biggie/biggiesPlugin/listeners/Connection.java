package me.biggie.biggiesPlugin.listeners;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BellRingEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.net.http.WebSocket;
public class Connection implements Listener {
    @EventHandler
    public void joinMessage(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Location plyLocation = player.getLocation();
        player.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 1.0f, 1.0f);
        event.joinMessage(Component.text("Welcome to the server, ")

                .color(NamedTextColor.DARK_AQUA)
                .append(Component.text(event.getPlayer().getName() + "!"))
                .decorate(TextDecoration.BOLD).color(NamedTextColor.GOLD));
    }

    @EventHandler
    public void leaveMessage(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Location plyLocation = player.getLocation();

        event.quitMessage(Component.text("Goodbye, ")

                .color(NamedTextColor.DARK_AQUA)
                .append(Component.text(event.getPlayer().getName() + "!"))
                .decorate(TextDecoration.BOLD).color(NamedTextColor.GOLD));
    }

}
