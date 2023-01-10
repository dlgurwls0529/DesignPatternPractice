package Creation.AbstractFactory.BasicAbstractFactory;

public class WhiteShip implements Ship {

    private Motor motor;
    private Anchor anchor;
    private Deck deck;
    private ShipPartFactory shipPartFactory;

    public ShipPartFactory getShipPartFactory() {
        return shipPartFactory;
    }

    public void setShipPartFactory(ShipPartFactory shipPartFactory) {
        this.shipPartFactory = shipPartFactory;
    }

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

    public void create() {
        setMotor(this.getShipPartFactory().createMotor());
        setAnchor(this.getShipPartFactory().createAnchor());
        setDeck(this.getShipPartFactory().createDeck());
    }

    @Override
    public void operate() {
        System.out.println("<BlackShip>");

        try {
            anchor.run();
            motor.run();
            deck.run();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
