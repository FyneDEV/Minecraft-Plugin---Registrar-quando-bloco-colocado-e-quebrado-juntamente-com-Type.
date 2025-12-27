package me.projetoteste.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class PlayerEventsTest {

    private PlayerEvents playerEvents;

    @Mock
    private BlockPlaceEvent blockPlaceEvent;

    @Mock
    private Player player;

    @Mock
    private Block block;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        playerEvents = new PlayerEvents();
    }

    @Test
    public void testBlockPlaceSendsMessageWithStoneBlock() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.STONE);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(player).sendMessage("§aVoce botou um bloco de §2STONE§a parabéns!");
    }

    @Test
    public void testBlockPlaceSendsMessageWithDirtBlock() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.DIRT);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(player).sendMessage("§aVoce botou um bloco de §2DIRT§a parabéns!");
    }

    @Test
    public void testBlockPlaceSendsMessageWithGrassBlock() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.GRASS);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(player).sendMessage("§aVoce botou um bloco de §2GRASS§a parabéns!");
    }

    @Test
    public void testBlockPlaceGetsPlayerFromEvent() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.STONE);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(blockPlaceEvent).getPlayer();
    }

    @Test
    public void testBlockPlaceGetsBlockFromEvent() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.STONE);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(blockPlaceEvent).getBlock();
    }

    @Test
    public void testBlockPlaceGetsBlockTypeFromBlock() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.WOOD);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(block).getType();
    }

    @Test
    public void testBlockPlaceSendsMessageWithWoodBlock() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.WOOD);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(player).sendMessage("§aVoce botou um bloco de §2WOOD§a parabéns!");
    }

    @Test
    public void testBlockPlaceCallsSendMessageOnce() {
        when(blockPlaceEvent.getPlayer()).thenReturn(player);
        when(blockPlaceEvent.getBlock()).thenReturn(block);
        when(block.getType()).thenReturn(Material.STONE);

        playerEvents.BlockPlace(blockPlaceEvent);

        verify(player, times(1)).sendMessage(anyString());
    }
}
