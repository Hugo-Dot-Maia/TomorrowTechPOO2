package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartyBoard implements IBoardGame{

    private ArrayList<ICard> deckPlayerOne, deckPlayerTwo, deckPlayerThree, deckPlayerFour, deckPlayerFive;
    private ArrayList<Player> players;


    public void addPlayers(Player player) throws Exception {
        if(this.players.size() >= 5)
            throw new Exception("Too much players");
        else
            this.players.add(player);
    }

    @Override
    public void createDeckPlayerOne(ArrayList<ICard> deckPlayerOne) {
        this.deckPlayerOne = deckPlayerOne;
    }

    @Override
    public void createDeckPlayerTwo(ArrayList<ICard> deckPlayerTwo) {
        this.deckPlayerTwo = deckPlayerTwo;
    }

    public void createDeckPlayerThree(ArrayList<ICard> deckPlayerThree) {
        this.deckPlayerThree = deckPlayerThree;
    }
    public void createDeckPlayerFour(ArrayList<ICard> deckPlayerFour) {
        this.deckPlayerFour = deckPlayerFour;
    }
    public void createDeckPlayerFive(ArrayList<ICard> deckPlayerFive) {
        this.deckPlayerFive = deckPlayerFive;
    }



    @Override
    public boolean playableCard(ICard card, Player player) {
        return player.getSpecialCards() <= 2 || player.getAttackCards() < 5;
    }

    public List<Player> playersAlive(){
        return players.stream()
                .filter(Player::getIsAlive).toList();
    }

    @Override
    public boolean checkWinner(Player player) {
        return playersAlive().size() == 1 && playersAlive().contains(player);
    }



    public PartyBoard(ArrayList<ICard> deckPlayerOne,
                      ArrayList<ICard> deckPlayerTwo,
                      ArrayList<ICard> deckPlayerThree,
                      ArrayList<ICard> deckPlayerFour,
                      ArrayList<ICard> deckPlayerFive,
                      ArrayList<Player> players) throws Exception {

        if (checkDeckSize(deckPlayerOne)
        && checkDeckSize(deckPlayerTwo)
        && checkDeckSize(deckPlayerThree)
        && checkDeckSize(deckPlayerFour)
        && checkDeckSize(deckPlayerFive)){
            createDeckPlayerOne(deckPlayerOne);
            createDeckPlayerTwo(deckPlayerTwo);
            createDeckPlayerThree(deckPlayerThree);
            createDeckPlayerFour(deckPlayerFour);
            createDeckPlayerFive(deckPlayerFive);
            this.players = players;
        }else{
            throw new Exception("Wrong size decks");
        }
    }

    private boolean checkDeckSize(ArrayList<ICard> deck) {
        return deck.size() == 80;
    }
}
