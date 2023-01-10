package Creation.AbstractFactory.OnFactoryMethod;

public interface ShipPartFactory {

    public Anchor createAnchor();
    public Motor createMotor();
    public Deck createDeck();
}
