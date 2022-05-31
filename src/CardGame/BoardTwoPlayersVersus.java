package CardGame;

import java.util.ArrayList;

public class BoardTwoPlayersVersus implements IBoardGame{

    private ArrayList<ICard> deckPlayerOne, deckPlayerTwo;
    private ArrayList<Player> players;


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayers(Player player) throws Exception {
        if(this.players.size() >= 2)
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

    @Override
    public boolean playableCard(ICard card, Player player) {
        return player.getSpecialCards() <= 2 || player.getAttackCards() < 5;
    }

    @Override
    public boolean checkWinner(Player player) {
        return this.players.stream().anyMatch(player1 -> !player.getIsAlive()) && player.getIsAlive();
    }

    public BoardTwoPlayersVersus(ArrayList<ICard> deckPlayerOne, ArrayList<ICard> deckPlayerTwo) throws Exception {

        if(checkDeckSize(deckPlayerOne, deckPlayerTwo)){
            createDeckPlayerOne(deckPlayerOne);
            createDeckPlayerTwo(deckPlayerTwo);
        }else {
            throw new Exception("Wrong size decks");
        }

    }

    private boolean checkDeckSize(ArrayList<ICard> deckPlayerOne, ArrayList<ICard> deckPlayerTwo) {

        return deckPlayerOne.size() == 50 && deckPlayerTwo.size() == 50;
    }


}
