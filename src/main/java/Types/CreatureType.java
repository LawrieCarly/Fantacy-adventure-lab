package Types;

public enum CreatureType {
    OGRE(1),
    DRAGON(10),
    TROLL(2);

    private final int defencePoints;

    CreatureType(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

}
