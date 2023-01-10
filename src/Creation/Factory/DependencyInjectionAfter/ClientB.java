package Creation.Factory.DependencyInjectionAfter;

public class ClientB {

    private ShipFactory shipFactory;

    public ShipFactory getShipFactory() {
        return shipFactory;
    }

    public void setShipFactory(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }
}
