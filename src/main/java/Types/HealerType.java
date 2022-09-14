package Types;

public enum HealerType {

    CLERIC(18, 4);

    private final int spellResistance;
    private final int weaponResistance;

    HealerType(int spellResistance, int weaponResistance) {
        this.spellResistance = spellResistance;
        this.weaponResistance = weaponResistance;
    }

    public int getSpellResistance() {
        return spellResistance;
    }

    public int getWeaponResistance() {
        return weaponResistance;
    }
}
