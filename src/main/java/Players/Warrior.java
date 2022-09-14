package Players;

import Behaviours.IAttack;
import Types.CasterType;
import Types.HealerType;
import Types.WarriorType;
import Types.WeaponType;

public class Warrior extends Player implements IAttack {

    private WarriorType warriorType;
    private WeaponType weapon;


    public Warrior(boolean alive, int healthPoints, WarriorType warriorType, WeaponType weapon) {
        super(alive, healthPoints);
        this.warriorType = warriorType;
        this.weapon = weapon;

    }

    public WarriorType getWarriorType() {
        return warriorType;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Player player) {
        int attackPoints = this.weapon.getAttackPoints();
        int totalDefencePoints = 0;
        int currentHealth = player.getHealthPoints();
        boolean fatal = false;

        // handles attack against Warrior
        if ((player) instanceof Warrior){
            WarriorType warriorType = ((Warrior) player).getWarriorType();
            totalDefencePoints += warriorType.getWeaponResistance();
        }

        // handles attack against Caster
        if ((player) instanceof Caster){
            CasterType casterType = ((Caster) player).getCasterType();
            totalDefencePoints += casterType.getWeaponResistance();
            totalDefencePoints += ((Caster) player).defend();
        }

        //handles attack against Healer
        if ((player) instanceof Healer){
            HealerType healerType = ((Healer) player).getHealerType();
            totalDefencePoints += healerType.getWeaponResistance();
        }

        // checks if blow is fatal
        fatal = attackPoints - totalDefencePoints > currentHealth;

        // handles fatal blow
        if (fatal){
            player.die();
        }
        // handles not fatal blow
        if(!fatal && attackPoints > totalDefencePoints){
            int newHealth = currentHealth - (attackPoints - totalDefencePoints);
            player.setHealthPoints(newHealth);
        }
    }
}
