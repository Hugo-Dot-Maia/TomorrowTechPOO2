package CardGame;

public abstract class BaseCard {
    String name;
    CardTypeEnum cardType;
    int cost;

    public BaseCard(String name, CardTypeEnum cardTypeEnum, int cost) {
        this.name = name;
        this.cardType = cardTypeEnum;
        this.cost = cost;
    }
}
