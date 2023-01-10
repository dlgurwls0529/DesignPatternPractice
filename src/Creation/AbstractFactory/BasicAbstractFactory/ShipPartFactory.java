package Creation.AbstractFactory.BasicAbstractFactory;

public interface ShipPartFactory {

    public Motor createMotor();
    public Deck createDeck();
    public Anchor createAnchor();
}
