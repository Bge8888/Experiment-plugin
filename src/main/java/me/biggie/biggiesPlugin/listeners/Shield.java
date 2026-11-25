package me.biggie.biggiesPlugin.listeners;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class Shield implements Listener {
    @EventHandler
    public void noFallDamage(EntityDamageEvent e){
        if (!(e.getEntity() instanceof Player ply)){
            return;
        }
        if(e.getCause() != EntityDamageEvent.DamageCause.FALL){
            return;
        }
        boolean shieldUp = ply.isBlocking();

        if (shieldUp) {
            e.setCancelled(true);
            ply.sendMessage(Component.text("Fall damage negated!").color(NamedTextColor.GOLD));
            ply.getWorld().spawnParticle(
                    Particle.SOUL, ply.getLocation().add(0,1.0,0),
                    25, 0.4,1,0.4,0.1
            );
            ply.playSound(ply.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.5f, 1.2f);
        }

    }
}






