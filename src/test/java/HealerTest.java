import Players.Healer;
import Types.HealerType;
import Types.ToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealerTest {

    Healer DrFeelGood;

    @Before
    public void setUp() {
        DrFeelGood = new Healer(true, 200, HealerType.CLERIC, ToolType.HERB);
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
}