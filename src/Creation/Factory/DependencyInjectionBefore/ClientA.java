package Creation.Factory.DependencyInjectionBefore;

public class ClientA {

    private ShipFactory shipFactory;

    public ShipFactory getShipFactory() {
        return shipFactory;
    }

    public void setShipFactory() {
        this.shipFactory = new BlackShipFactory();
    }

}
