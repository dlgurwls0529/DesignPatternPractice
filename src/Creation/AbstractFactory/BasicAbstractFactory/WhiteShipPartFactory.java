package Creation.AbstractFactory.BasicAbstractFactory;

public class WhiteShipPartFactory implements ShipPartFactory{

    @Override
    public Motor createMotor() {
        return new WhiteShipMotor();
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
