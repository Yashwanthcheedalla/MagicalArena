package magical.arena.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import magical.arena.MagicalArena;
import magical.arena.player.Player;

public class MagicalArenaTest {
    private Player playerA;
    private Player playerB;
    private MagicalArena arena;

    @BeforeEach
    public void setup() {
        playerA = new Player("John", 100, 20, 15);
        playerB = new Player("Bravos", 100, 18, 12);
        arena = new MagicalArena(playerA, playerB);
    }

    @Test
    public void testStartMatch() {
        arena.startMatch();
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
        assertNotNull(playerA.getName());
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals(100, player.getHealth());
        player.takeDamage(20);
        assertEquals(80, player.getHealth());
        player.takeDamage(90); // Damage exceeds health
        assertEquals(0, player.getHealth());
    }
}
