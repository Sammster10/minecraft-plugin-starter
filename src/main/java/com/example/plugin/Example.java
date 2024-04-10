package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabled!!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info("Disabled!!");
    }
}
