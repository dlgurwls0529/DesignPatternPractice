package Creation.Factory.Example;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
