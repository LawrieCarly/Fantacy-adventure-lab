public class Warrior extends Player{

    private final WarriorType warriorType;
    private final WeaponType weapon;


    Warrior(boolean alive, int healthPoints, WarriorType warriorType, WeaponType weapon) {
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
}
