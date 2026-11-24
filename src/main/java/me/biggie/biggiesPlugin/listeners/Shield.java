package me.biggie.biggiesPlugin.listeners;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class Shield implements Listener {
    public void noFallDamage(EntityDamageEvent e){
        if (!(e.getEntity() instanceof Player ply)){
            return;
        }
        if(e.getCause() != EntityDamageEvent.DamageCause.FALL){
            return;
        }
        boolean shieldInMainHand = ply.getInventory().getItemInMainHand().getType() == Material.SHIELD;
        boolean shieldInOffHand = ply.getInventory().getItemInOffHand().getType() == Material.SHIELD;
        if (shieldInMainHand || shieldInOffHand) {
            e.setCancelled(true);
            ply.sendMessage(Component.text("Fall damage negated!").color(NamedTextColor.GOLD));
            ply.getWorld().spawnParticle(
                    Particle.WHITE_ASH, ply.getLocation().add(0,1.0,0),
                    40, 0.4,0.5,0.4,0.2
            );

        }

    }
}






