package Players;

public class Player {

    protected boolean alive;
    protected int healthPoints;

    public Player(boolean alive, int healthPoints) {
        this.alive = alive;
        this.healthPoints = healthPoints;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
