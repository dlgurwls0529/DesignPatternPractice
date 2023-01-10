package Creation.AbstractFactory.OnFactoryMethod;

public class BlackShip implements Ship {

    private Anchor anchor;
    private Motor motor;
    private Deck deck;

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public void operate() {
        System.out.println("<BlackShip>");
        getAnchor().run();
        getMotor().run();
        getDeck().run();
    }
}
