package Creation.Factory.Example;

public interface ShipFactory {

    public default Ship orderShip(String name, String email) {
        prepareShipProcess();
        Ship ship = createShip(name);
        notifyCompletion(ship);
        sendEmail(email);
        terminateShipProcess();

        return ship;
    }

    private void terminateShipProcess() {
        System.out.println("terminate ship manufacturing process.");
        System.out.println("========================================");
    }

    private void prepareShipProcess() {
        System.out.println("========================================");
        System.out.println("start ship manufacturing process.");
    }

    public Ship createShip(String name);

    private void notifyCompletion(Ship ship) {
        System.out.println("complete ship creation");
        System.out.println("created ship name : "+ ship.getName());
        System.out.println("created ship color : "+ ship.getColor());
        System.out.println("created ship number : "+ ship.getNumber());
    }

    private void sendEmail(String email) {
        System.out.println("email is sent to " + email);
    }
}
