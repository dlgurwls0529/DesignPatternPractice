package Creation.AbstractFactory.BasicAbstractFactory;

public class MixShipPartFactory implements ShipPartFactory{

    @Override
    public Motor createMotor() {
        return new BlackShipMotor();
    }

    @Override
    public Deck createDeck() {
        return new WhiteShipDeck();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteShipAnchor();
    }
}
