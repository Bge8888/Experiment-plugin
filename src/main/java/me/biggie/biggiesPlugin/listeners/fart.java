package me.biggie.biggiesPlugin.listeners;

import io.papermc.paper.datacomponent.item.Consumable;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;

public class fart implements Listener {
    @EventHandler
    public void sneakFart(PlayerToggleSneakEvent e){
        var ply = e.getPlayer();
        ply.getWorld().spawnParticle(
                Particle.BUBBLE_POP, ply.getLocation().add(0,1.0,0),
                20);
        ply.playSound(ply.getLocation(), Sound.BLOCK_NOTE_BLOCK_TRUMPET_OXIDIZED, 1.0f, 1.0f);
    }



}
