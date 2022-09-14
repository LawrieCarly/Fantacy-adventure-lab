public enum SpellType {
    FIREBALL(10),
    LIGHTNINGSTRIKE(12);

    private final int attackPoints;

    SpellType(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }
}
