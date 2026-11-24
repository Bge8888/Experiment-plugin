package me.biggie.biggiesPlugin;

import me.biggie.biggiesPlugin.listeners.Connection;
import me.biggie.biggiesPlugin.listeners.Teleportation;
import org.bukkit.plugin.java.JavaPlugin;

public final class BiggiesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BIGGIE IS UP!");
        getServer().getPluginManager().registerEvents(new Connection(), this);
        getServer().getPluginManager().registerEvents(new Teleportation(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BIGGIE DOWN!");
    }
}
