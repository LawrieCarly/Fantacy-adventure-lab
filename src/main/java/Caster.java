public class Caster extends Player implements IAttack {

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


}
