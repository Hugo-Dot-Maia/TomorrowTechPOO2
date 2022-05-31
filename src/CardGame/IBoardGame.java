package CardGame;

import java.util.ArrayList;

public interface IBoardGame {
    void createDeckPlayerOne(ArrayList<ICard> deck);
    void createDeckPlayerTwo(ArrayList<ICard> deck);
    boolean playableCard(ICard card, Player player);
    boolean checkWinner(Player player);
}
