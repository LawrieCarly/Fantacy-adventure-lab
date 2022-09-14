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

        boolean fatal = false;

        // handles attack against Warrior
        if ((player) instanceof Warrior){
            WarriorType warriorType = ((Warrior) player).getWarriorType();
            int resistance = warriorType.getWeaponResistance();
            int currentHealth = player.getHealthPoints();
            if (attackPoints >= currentHealth + resistance){
                fatal = true;
            }
            if (!fatal){
                player.healthPoints -= (attackPoints - resistance);
            }
        }

        // handles attack against Caster
        if ((player) instanceof Caster){
            CasterType casterType = ((Caster) player).getCasterType();
            int resistance = casterType.getWeaponResistance();
            int defencePoints = ((Caster) player).defend();
            int currentHealth = player.getHealthPoints();
            if (attackPoints >= currentHealth + resistance + defencePoints){
                fatal = true;
            }
            if(!fatal && defencePoints + resistance <= attackPoints){
                player.healthPoints -= (attackPoints - resistance - defencePoints);
            }
        }

        //handles attack against Healer
        if ((player) instanceof Healer){
            HealerType healerType = ((Healer) player).getHealerType();
            int resistance = healerType.getWeaponResistance();
            int currentHealth = player.getHealthPoints();
            if (attackPoints >= currentHealth + resistance){
                fatal = true;
            }
            if (!fatal){
                player.healthPoints -= (attackPoints - resistance);
            }
        }

        // handles fatal blow
        if (fatal){
            player.die();
        }
    }
}
