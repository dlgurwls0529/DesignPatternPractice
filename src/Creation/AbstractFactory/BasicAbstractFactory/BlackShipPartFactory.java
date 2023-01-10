package Creation.AbstractFactory.BasicAbstractFactory;

public class BlackShipPartFactory implements ShipPartFactory{

    @Override
    public Motor createMotor() {
        return new BlackShipMotor();
    }

    @Override
    public Deck createDeck() {
        return new BlackShipDeck();
    }

    @Override
    public Anchor createAnchor() {
        return new BlackShipAnchor();
    }
}
