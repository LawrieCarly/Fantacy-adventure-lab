import Players.Caster;
import Players.Healer;
import Players.Player;
import Players.Warrior;
import Types.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.ToLongBiFunction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    Warrior warrior;
    Caster caster;
    Healer healer;
    ArrayList<Player> players;
    Room room;

    @Before
    public void before(){
        warrior = new Warrior(true, 20, WarriorType.BARBARIAN, WeaponType.SWORD);
        caster = new Caster(true,29, CasterType.WIZARD, SpellType.LIGHTNINGSTRIKE, CreatureType.OGRE);
        healer = new Healer(true, 50, HealerType.CLERIC, ToolType.HERB);
        players = new ArrayList<>();

        players.add(warrior);
        players.add(caster);
        players.add(healer);

        room = new Room(players);
    }

    @Test
    public void canFightToDeath(){
        room.fightToDeath();

        assertTrue(room.isCompleted());
    }

}
