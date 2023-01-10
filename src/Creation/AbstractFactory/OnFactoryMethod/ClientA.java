package Creation.AbstractFactory.OnFactoryMethod;

public class ClientA {

    public void orderShip() {
        Ship blackShip = new BlackShipFactory(new BlackPartFactory()).createShip();
        blackShip.operate();

        Ship whiteShip = new WhiteShipFactory(new WhitePartFactory()).createShip();
        whiteShip.operate();

        // Ship ship = new ShipFactory("blackShip");
        // Ship ship = new BlackShipFactory().createShip();
    }
}
