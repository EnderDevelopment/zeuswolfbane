package com.example.wolfzeus;

import org.bukkit.plugin.java.JavaPlugin;

public final class WolfZeusPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WolfZeusListener(), this);
    }
}
