public enum ToolType {
    POTION(5),
    HERB(2);

    private final int restorePoints;

    ToolType(int restorePoints) {
        this.restorePoints = restorePoints;
    }

    public int getRestorePoints() {
        return restorePoints;
    }
}
