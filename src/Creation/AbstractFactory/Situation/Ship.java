package Creation.AbstractFactory.Situation;

public interface Ship {

    public void setMotor(Motor motor);
    public void setAnchor(Anchor anchor);
    public void setDeck(Deck deck);
    public void operate();
}
