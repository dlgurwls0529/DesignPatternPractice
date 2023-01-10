package Creation.Factory.DependencyInjectionAfter;

public class ClientA {

    private ShipFactory shipFactory;

    public ShipFactory getShipFactory() {
        return shipFactory;
    }

    public void setShipFactory(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }
}
