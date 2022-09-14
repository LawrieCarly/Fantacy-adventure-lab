package Players;

import Behaviours.IAttack;
import Behaviours.IDefend;
import Types.CasterType;
import Types.CreatureType;
import Types.SpellType;

public class Caster extends Player implements IAttack, IDefend {

    private CasterType casterType;
    private SpellType spell;
    private CreatureType creature;

    public Caster(boolean alive, int healthPoints, CasterType casterType, SpellType spell, CreatureType creature) {
        super(alive, healthPoints);
        this.casterType = casterType;
        this.spell = spell;
        this.creature = creature;
    }

    public CasterType getCasterType() {
        return casterType;
    }

    public SpellType getSpell() {
        return spell;
    }

    public CreatureType getCreature() {
        return creature;
    }


    public void changeSpell(SpellType spell) {
        this.spell = spell;
    }

    public void changeCreature(CreatureType creature) {
        this.creature = creature;
    }

    @Override
    public void attack(Player player) {

    }


    @Override
    public int defend() {
        return this.creature.getDefencePoints();
    }
}
