public enum CasterType {

    WIZARD(10, 2),
    WARLOCK(8, 7);

    private final int spellResistance;
    private final int weaponResistance;

    CasterType(int spellResistance, int weaponResistance) {
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
