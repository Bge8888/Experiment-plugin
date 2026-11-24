package me.biggie.biggiesPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BiggiesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BIGGIE IS UP!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BIGGIE DOWN!");
    }
}
