package Creation.AbstractFactory.OnFactoryMethod;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartFactory shipPartFactory;

    public WhiteShipFactory(ShipPartFactory shipPartFactory) {
        this.shipPartFactory = shipPartFactory;
    }

    @Override
    public Ship createShip() {
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.setAnchor(shipPartFactory.createAnchor());
        whiteShip.setMotor(shipPartFactory.createMotor());
        whiteShip.setDeck(shipPartFactory.createDeck());

        return whiteShip;
    }
}
