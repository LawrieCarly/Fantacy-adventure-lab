package Types;

public enum WeaponType {

    SWORD(12),
    AXE(9),
    CLUB(7);

    private final int attackPoints;

    WeaponType(int attackPoints) {
        this.attackPoints = attackPoints;

    }

    public int getAttackPoints() {
        return this.attackPoints;
    }
}
