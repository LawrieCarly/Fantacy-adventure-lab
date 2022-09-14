import Players.Caster;
import Players.Healer;
import Players.Player;
import Players.Warrior;

import java.util.ArrayList;
import java.util.Collections;

public class Room {

    private ArrayList<Player> players;
    private boolean completed;

    public Room (ArrayList<Player> players) {
        this.players = players;
        this.completed = false;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void isComplete(){
        int alivePlayers = 0;
        for( Player player: this.players){
            if (player.isAlive()){
                alivePlayers += 1;
            }
        }
        if (alivePlayers == 1){
            this.completed = true;
        }
    }

    public void fightToDeath(){
        if(this.completed){
            return;
        }
        for (Player player: this.players) {

            Player randomPlayer = this.getRandomPlayer();

            if (player instanceof Warrior) {
                ((Warrior) player).attack(randomPlayer);
            }
            if (player instanceof Caster) {
                ((Caster) player).attack(randomPlayer);
            }
            if (player instanceof Healer) {
                ((Healer) player).heal(randomPlayer);
            }
        }
        this.isComplete();
        this.fightToDeath();
    }

    private Player getRandomPlayer() {
        ArrayList<Player> randomisedList = new ArrayList<Player>();
        randomisedList.addAll(this.players);
        Collections.shuffle(randomisedList);
        return randomisedList.get(0);
    }


}
