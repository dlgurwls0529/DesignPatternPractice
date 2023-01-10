package Creation.Factory.DependencyInjectionAfter;

public class ClientC {

    private ShipFactory shipFactory;

    public ShipFactory getShipFactory() {
        return shipFactory;
    }

    public void setShipFactory(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }
}
