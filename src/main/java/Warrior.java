public class Warrior extends Player{

    private WarriorType warriorType;
    private WeaponType weapon;


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

    public void changeWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
