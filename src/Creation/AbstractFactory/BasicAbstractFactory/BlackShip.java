package Creation.AbstractFactory.BasicAbstractFactory;

public class BlackShip implements Ship {

    private Motor motor;
    private Anchor anchor;
    private Deck deck;
    private ShipPartFactory shipPartFactory;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public void setShipPartFactory(ShipPartFactory shipPartFactory) {
        this.shipPartFactory = shipPartFactory;
    }

    public ShipPartFactory getShipPartFactory() {
        return shipPartFactory;
    }

    @Override
    public void create() {
        setMotor(this.getShipPartFactory().createMotor());
        setDeck(this.getShipPartFactory().createDeck());
        setAnchor(this.getShipPartFactory().createAnchor());
    }

    @Override
    public void operate() {
        System.out.println("<WhiteShip>");
        anchor.run();
        deck.run();
        deck.run();
    }
}
