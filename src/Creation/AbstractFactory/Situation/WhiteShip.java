package Creation.AbstractFactory.Situation;

public class WhiteShip implements Ship{

    private Motor motor;
    private Anchor anchor;
    private Deck deck;

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
    public void operate() {
        System.out.println("<BlackShip>");
        anchor.run();
        motor.run();
        deck.run();
    }
}
