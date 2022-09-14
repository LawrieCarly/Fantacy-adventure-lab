public enum WarriorType {

    DWARF(2, 2),
    BARBARIAN (3, 5),
    KNIGHT (4, 3);

    private final int spellResistance;
    private final int weaponResistance;


    WarriorType(int spellResistance, int weaponResistance) {
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