public enum CreatureType {
    OGRE(1, 3),
    DRAGON(10, 10),
    TROLL(2, 2);

    private final int spellResistance;
    private final int weaponResistance;

    CreatureType(int spellResistance, int weaponResistance) {
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
