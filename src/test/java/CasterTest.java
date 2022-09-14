import org.junit.Before;
import org.junit.Test;

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

}
