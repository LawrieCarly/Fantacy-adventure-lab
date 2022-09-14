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

        if ((player) instanceof Warrior){
            WarriorType warriorType = ((Warrior) player).getWarriorType();
            int resistance = warriorType.getWeaponResistance();
            player.healthPoints -= (attackPoints - resistance);
        }
        if ((player) instanceof Caster){
            CasterType casterType = ((Caster) player).getCasterType();
            int resistance = casterType.getWeaponResistance();
            int defencePoints = ((Caster) player).defend();
            if(defencePoints + resistance <= attackPoints){
                player.healthPoints -= (attackPoints - resistance - defencePoints);
            }
        }
        if ((player) instanceof Healer){
            HealerType healerType = ((Healer) player).getHealerType();
            int resistance = healerType.getWeaponResistance();
            player.healthPoints -= (attackPoints - resistance);
        }
    }
}
