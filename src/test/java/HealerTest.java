import Players.Healer;
import Players.Player;
import Players.Warrior;
import Types.HealerType;
import Types.ToolType;
import Types.WarriorType;
import Types.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealerTest {

    Healer DrFeelGood;
    Warrior spartacus;

    @Before
    public void setUp() {
        DrFeelGood = new Healer(true, 200, HealerType.CLERIC, ToolType.HERB);
        spartacus = new Warrior(true, 15, WarriorType.BARBARIAN, WeaponType.SWORD);
    }

    @Test
    public void getHealerType() {
        assertEquals(HealerType.CLERIC, DrFeelGood.getHealerType());
    }

    @Test
    public void getTool() {
        assertEquals(ToolType.HERB, DrFeelGood.getTool());
    }

    @Test
    public void changeTool() {
        DrFeelGood.changeTool(ToolType.POTION);
        assertEquals(ToolType.POTION, DrFeelGood.getTool());
    }

    @Test
    public void canHeal(){
        DrFeelGood.heal(spartacus);
        assertEquals(17, spartacus.getHealthPoints());
    }

    @Test
    public void cantHealDeadPlayers(){
        Player player = new Player(false, 0);

        DrFeelGood.heal(player);
        assertEquals(0, player.getHealthPoints());
    }
}