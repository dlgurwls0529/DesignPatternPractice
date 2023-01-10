package Creation.Factory.Example;

public class FastShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new FastShip(name);
    }
}
