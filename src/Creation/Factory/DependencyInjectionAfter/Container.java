package Creation.Factory.DependencyInjectionAfter;

public class Container {
    private final WhiteShipFactory whiteShipFactory = new WhiteShipFactory();
    private final BlackShipFactory blackShipFactory = new BlackShipFactory();

    private static class Holder {
        public static final Container INSTANCE = new Container();
    }

    private Container() {};

    public static Container getInstance() {
        return Holder.INSTANCE;
    }

    public ClientA requestClientA() {
        ClientA clientA = new ClientA();
        clientA.setShipFactory(blackShipFactory); // 주입
        return clientA;
    }

    public ClientB requestClientB() {
        ClientB clientB = new ClientB();
        clientB.setShipFactory(whiteShipFactory);
        return clientB;
    }

    public ClientC requestClientC() {
        ClientC clientC = new ClientC();
        clientC.setShipFactory(blackShipFactory);
        return clientC;
    }

}
