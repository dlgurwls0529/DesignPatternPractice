package Creation.AbstractFactory.OnFactoryMethod;

public class BlackShipFactory implements ShipFactory{

    private ShipPartFactory shipPartFactory;

    public BlackShipFactory(ShipPartFactory shipPartFactory) {
        this.shipPartFactory = shipPartFactory;
    }

    @Override
    public Ship createShip() {
        BlackShip blackShip = new BlackShip();
        blackShip.setAnchor(shipPartFactory.createAnchor());
        blackShip.setMotor(shipPartFactory.createMotor());
        blackShip.setDeck(shipPartFactory.createDeck());

        return blackShip;
    }
}
