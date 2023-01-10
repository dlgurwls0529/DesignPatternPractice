package Creation.AbstractFactory.OnFactoryMethod;

public class BlackPartFactory implements ShipPartFactory{

    @Override
    public Anchor createAnchor() {
        return new BlackAnchor();
    }

    @Override
    public Motor createMotor() {
        return new BlackMotor();
    }

    @Override
    public Deck createDeck() {
        return new BlackDeck();
    }
}
