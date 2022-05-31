package CardGame;

public class SpecialCard extends AttackCard{

    private final SpecialEffectsEnum specialEffect;

    public SpecialCard(String name, CardTypeEnum cardTypeEnum, int cost, int power, int protection, SpecialEffectsEnum specialEffect) {
        super(name, cardTypeEnum, cost, power, protection);
        this.specialEffect = specialEffect;
    }

    public SpecialEffectsEnum getSpecialEffect() {
        return specialEffect;
    }
}
