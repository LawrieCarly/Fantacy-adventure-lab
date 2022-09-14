import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasterTest {

    Caster caster;

    @Before
    public void before(){
        caster = new Caster(true, 100, CasterType.WIZARD, SpellType.FIREBALL, CreatureType.OGRE);
    }

    @Test
    public void hasCasterType(){
        CasterType casterType = caster.getCasterType();
        int spellResistance = casterType.getSpellResistance();
        assertEquals(10, spellResistance);
    }

    @Test
    public void hasSpell() {
        SpellType spell = caster.getSpell();
        int spellAttackPoints = spell.getAttackPoints();
        assertEquals(10, spellAttackPoints);
    }

    @Test
    public void hasCreature(){
        CreatureType creature = caster.getCreature();
        int creatureSpellResistance = creature.getSpellResistance();
        assertEquals(1, creatureSpellResistance);
    }

    @Test
    public void canChangeWeapon(){
        
    }
}
