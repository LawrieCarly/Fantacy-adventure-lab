import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
        player = new Player(true, 100);
    }

    @Test
    public void isAlive() {
        assertTrue(player.isAlive());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(100, player.getHealthPoints());
    }
}