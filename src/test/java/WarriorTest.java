import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior spartacus;
    Warrior tron;
    Warrior kane;


    @Before
    public void setUp() {
        spartacus = new Warrior(true, 100, WarriorType.BARBARIAN, WeaponType.AXE);
        tron = new Warrior(true, 70, WarriorType.KNIGHT, WeaponType.SWORD);
        kane = new Warrior(true, 80, WarriorType.DWARF, WeaponType.CLUB);
    }

    @Test
    public void getWarriorType() {
        assertEquals(WarriorType.BARBARIAN, spartacus.getWarriorType());
    }

    @Test
    public void getWeapon() {
        assertEquals(WeaponType.CLUB, kane.getWeapon());

    }
}