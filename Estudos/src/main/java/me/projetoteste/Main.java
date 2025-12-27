package me.projetoteste;

import me.projetoteste.events.PlayerEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        LoadConfig();
        RegisterEvents();
        Bukkit.getConsoleSender().sendMessage("§a[ProjetoTeste] Plugin Ativado com Sucesso!");
    }



    private void RegisterEvents() {
        Bukkit.getPluginManager().registerEvents(new PlayerEvents(), this);
    }

    private void LoadConfig() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }
}