package Creation.AbstractFactory.BasicAbstractFactory;

public interface Ship {

    public void setMotor(Motor motor);
    public void setAnchor(Anchor anchor);
    public void setDeck(Deck deck);
    public void setShipPartFactory(ShipPartFactory shipPartFactory);
    public void create();
    public void operate();
}
