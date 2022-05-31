package CardGame;

public class AttackCard extends BaseCard implements ICard {

    int power, protection;


    public AttackCard(String name, CardTypeEnum cardType, int cost, int power, int protection) {
        super(name, cardType, cost);
        this.power = power;
        this.protection = protection;
    }

    public int getPower() {
        return power;
    }

    public int getProtection() {
        return protection;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CardTypeEnum getCardType() {
        return cardType;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
