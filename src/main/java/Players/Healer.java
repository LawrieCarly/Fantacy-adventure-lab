package Players;

import Behaviours.IHeal;
import Players.Player;
import Types.HealerType;
import Types.ToolType;

public class Healer extends Player implements IHeal {

    private HealerType healerType;
    private ToolType tool;


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

    @Override
    public void heal(Player player) {
        if (player.isAlive()) {
            int healthPoints = player.getHealthPoints();
            int restorePoints = this.tool.getRestorePoints();
            player.setHealthPoints(healthPoints + restorePoints);
        }
    }
}
