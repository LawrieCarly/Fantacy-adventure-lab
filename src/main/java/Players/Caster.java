package Players;

import Behaviours.IAttack;
import Behaviours.IDefend;
import Types.*;

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
        int attackPoints = this.spell.getAttackPoints();
        if((player) instanceof Caster){
            CasterType casterType = ((Caster) player).getCasterType();
            int defencePoints = ((Caster) player).defend();
            int resistancePoints = casterType.getSpellResistance();
            if(attackPoints >= resistancePoints + defencePoints){
                player.healthPoints -= attackPoints - resistancePoints - defencePoints;
            }
        }
        if ((player) instanceof Warrior){
            WarriorType warriorType = ((Warrior) player).getWarriorType();
            int resistancePoints = warriorType.getSpellResistance();
            if(attackPoints >= resistancePoints){
                player.healthPoints -= attackPoints - resistancePoints;
            }
        }
        if ((player) instanceof Healer){
            HealerType healerType = ((Healer) player).getHealerType();
            int resistancePoints = healerType.getSpellResistance();
            if(attackPoints >= resistancePoints){
                player.healthPoints -= attackPoints - resistancePoints;
            }
        }
    }


    @Override
    public int defend() {
        return this.creature.getDefencePoints();
    }
}
