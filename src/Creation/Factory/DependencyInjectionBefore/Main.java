package Creation.Factory.DependencyInjectionBefore;

public class Main {
    public static void main(String[] args) {
        ClientA clientA = new ClientA();
        clientA.setShipFactory();
        clientA.getShipFactory().createShip().info();

        ClientB clientB = new ClientB();
        clientB.setShipFactory();
        clientB.getShipFactory().createShip().info();

        ClientC clientC = new ClientC();
        clientC.setShipFactory();
        clientC.getShipFactory().createShip().info();

        // ClientA, B, C 클래스가 WhiteShipFactory 클래스에 의존한다.
        // BlackShipFactory 로 바꿀려면, 세 부분에 가서 각각 한 줄 씩을 고쳐야 하기 때문이다. (세 클래스에 접근 및 수정의 필요)
        // Dependency injection 을 활용해 이 의존을 줄여보자.
    }
}
