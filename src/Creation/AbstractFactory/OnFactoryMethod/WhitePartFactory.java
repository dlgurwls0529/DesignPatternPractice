package Creation.AbstractFactory.OnFactoryMethod;

public class WhitePartFactory implements ShipPartFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Motor createMotor() {
        return new WhiteMotor();
    }

    @Override
    public Deck createDeck() {
        return new WhiteDeck();
    }
}
