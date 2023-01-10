package Creation.Factory.DependencyInjectionAfter;

public class Main {
    public static void main(String[] args) {
        /*
        ClientA clientA = new ClientA();
        clientA.orderShip();
        clientA.getShipFactory().createShip().info();

        ClientB clientB = new ClientB();
        clientB.orderShip();
        clientB.getShipFactory().createShip().info();

        ClientC clientC = new ClientC();
        clientC.orderShip();
        clientC.getShipFactory().createShip().info();
        */

        ClientA clientA = Container.getInstance().requestClientA();
        clientA.getShipFactory().createShip().info();

        ClientB clientB = Container.getInstance().requestClientB();
        clientB.getShipFactory().createShip().info();

        ClientC clientC = Container.getInstance().requestClientC();
        clientC.getShipFactory().createShip().info();


        // https://kotlinworld.com/64
        // 의존성 주입이란, 한 클래스에서 담당하던 의존 관계 결정을
        // 외부 클래스로 위임하는 것이다.
        // 구체적으로는 의존 관계의 인터페이스화 + 인스턴스를 외부(컨테이너)에서 생성해 주입하는 것
        // 그리고 이러한 주입 로직을 컨테이너에 응집시키는 것이다.
        // 예를 들자면,
        // 본 예제에서 원래는 Client 클래스에서 shipFactory = new BlackShipFactory()
        // 처럼 의존 당하는 객체를 의존하는 객체에 집어넣는 것이 아니라
        // <Client>
        // setFactory (ShipFactory shipFactory) {
        //  this.shipFactory = shipFactory;
        // }
        // <Container>
        // getClient {
        //  Client client = new Client();
        //  client.setFactory(new BlackShipFactory();
        //  return new Client(client);
        // }
        // 이처럼 Container 클래스에서 Client 의 setter 를 활용해(생성자일 수도 있다.)
        // 의존성을 주입하고, 주입된 객체를 반환하여 Application 부분에서 사용할 수 있게 하는 것이다.

        // 대표적인 장점으로는 결합도를 낮추는 데 있다.
        // 기존에는 각 클라이언트의 요구 사항이 변화하면
        // 각 클래스에 수정을 가해야 하고, 심지어 모두 변하면 세 클래스를 수정해야 한다.
        // 근데, 이렇게 하면, 하나의 클래스만 수정해도 된다.
        // (WhiteShipFactory 나 BlackShipFactory 없애면 Container 하나 에만 빨간줄 뜨니까)
        // 즉, 클래스 간의 결합도가 낮아진다.

        // ClientA, B, C 클래스가 WhiteShipFactory 클래스에 의존하는 상황이다.
        // BlackShipFactory 로 바꿀려면, 세 부분에 가서 각각 한 줄 씩을 고쳐야 하기 때문이다.
        // Dependency injection 을 활용해 이 의존을 줄여보자.

        // 본 예제는 실제 컨테이너와는 다르다.
        // 실제로는 타입같은거를 다 찾아서 자동으로 만드는 듯 하다.
        // https://pmandocom.tistory.com/103
        // 하지만, 그 구조를 모사하여 간단히 팩토리 메소드 패턴에 DI 컨테이너를 만들어보자
        // 1. 의존성을 주입할 컨테이너를 만든다.
        // 2. 필드로 팩토리들을 다 생성 (Eager Initialization, 주입할 Source)
        // 3. 주입 메서드를 구현한다. 반환 타입은 주입 당하는 클래스 타입
        // 4. application 부분에서 컨테이너를 통해 주입된 객체를 받는다.
    }
}
