import Players.Caster;
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
        Player randomPlayer = this.getRandomPlayer();

        for (Player player: this.players){
            if (player instanceof Warrior){
                ((Warrior) player).attack(randomPlayer);
            }
            if (player instanceof Caster){
                ((Caster) player).attack(randomPlayer);
            }
        }
    }

    private Player getRandomPlayer() {
        ArrayList<Player> randomisedList = new ArrayList<Player>();
        randomisedList.addAll(this.players);
        Collections.shuffle(randomisedList);
        return randomisedList.get(0);
    }


}
