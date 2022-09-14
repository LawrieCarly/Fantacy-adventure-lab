import Players.Caster;
import Players.Healer;
import Players.Warrior;
import Types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WarriorTest {

    Warrior spartacus;
    Warrior tron;
    Warrior kane;

    Healer DrFeelGood;

    Caster caster;


    @Before
    public void setUp() {
        spartacus = new Warrior(true, 100, WarriorType.BARBARIAN, WeaponType.AXE);
        tron = new Warrior(true, 70, WarriorType.KNIGHT, WeaponType.SWORD);
        kane = new Warrior(true, 80, WarriorType.DWARF, WeaponType.CLUB);
        DrFeelGood = new Healer(true, 50, HealerType.CLERIC, ToolType.HERB);
        caster = new Caster(true, 20, CasterType.WIZARD, SpellType.LIGHTNINGSTRIKE, CreatureType.OGRE);
    }

    @Test
    public void getWarriorType() {
        assertEquals(WarriorType.BARBARIAN, spartacus.getWarriorType());
    }

    @Test
    public void getWeapon() {
        assertEquals(WeaponType.CLUB, kane.getWeapon());

    }

    @Test
    public void canAttackWarrior() {
        spartacus.attack(tron);
        assertEquals(64, tron.getHealthPoints());
    }

    @Test
    public void canAttackOtherTypes(){
        spartacus.attack(DrFeelGood);
        spartacus.attack(caster);
        assertEquals(45, DrFeelGood.getHealthPoints());
        assertEquals(14, caster.getHealthPoints());
    }

    @Test
    public void canKillWarrior(){
        Warrior lowHealthWarrior = new Warrior(true, 1, WarriorType.BARBARIAN, WeaponType.SWORD);
        spartacus.attack(lowHealthWarrior);

        assertFalse(lowHealthWarrior.isAlive());
        assertEquals(0, lowHealthWarrior.getHealthPoints());
    }

    @Test
    public void canKillCasterAndHealer(){
        Caster lowHealthCaster = new Caster(true, 1, CasterType.WIZARD, SpellType.LIGHTNINGSTRIKE, CreatureType.OGRE);
        Healer lowHealthHealer = new Healer(true, 1, HealerType.CLERIC, ToolType.HERB);

        spartacus.attack(lowHealthHealer);
        spartacus.attack(lowHealthCaster);

        assertFalse(lowHealthCaster.isAlive());
        assertFalse(lowHealthHealer.isAlive());

        assertEquals(0, lowHealthCaster.getHealthPoints());
        assertEquals(0, lowHealthHealer.getHealthPoints());
    }

}