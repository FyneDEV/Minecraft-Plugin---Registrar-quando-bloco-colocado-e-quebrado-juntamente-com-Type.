package me.projetoteste.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerEvents implements Listener {

    @EventHandler
    public void BLockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();
        p.sendMessage("§aVoce quebrou um bloco de §2" + b.getType() + "§a parabéns!");
    }

    @EventHandler
    public void BlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();
        p.sendMessage("§aVoce botou um bloco de §2" + b.getType() + "§a parabéns!");
    }
}
