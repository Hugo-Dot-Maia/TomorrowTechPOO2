package CardGame;

import java.util.ArrayList;

public class Player {
    int healthPoints;
    private boolean isAlive;
    final PlayerEnum playerId;
    ArrayList<ICard> playerBoard;

    public boolean getIsAlive() {
        return isAlive;
    }


    public int getSpecialCards(){
        int specialCards = 0;
        for (var card : playerBoard){
            if (card instanceof SpecialCard)
                specialCards++;

        }
        return specialCards;
    }

    public int getAttackCards(){
        int attackCards = 0;
        for (var card : playerBoard){
            if (!(card instanceof SpecialCard))
                attackCards++;

        }
        return attackCards;
    }



    public int getHealthPoints() {
        return healthPoints;
    }

    public void updateHealth(int hitPoints) {
        this.healthPoints += hitPoints;
        if (this.healthPoints <= 0)
            killPlayer();
    }

    private void killPlayer() {
        this.isAlive = false;
    }


    public Player(int healthPoints, boolean isAlive, PlayerEnum playerId, ArrayList<ICard> playerBoard) {
        this.healthPoints = healthPoints;
        this.isAlive = true;
        this.playerId = playerId;
        this.playerBoard = playerBoard;
    }
}
