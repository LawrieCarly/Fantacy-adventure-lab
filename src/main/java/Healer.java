public class Healer extends Player {

    private final HealerType healerType;
    private final ToolType tool;


    public Healer(boolean alive, int healthPoints, HealerType healerType, ToolType tool) {
        super(alive, healthPoints);
        this.healerType = healerType;
        this.tool = tool;
    }

    public HealerType getHealerType() {
        return healerType;
    }

    public ToolType getTool() {
        return tool;
    }

    public void changeTool(ToolType tool){
        this.tool = tool;
    }
}
