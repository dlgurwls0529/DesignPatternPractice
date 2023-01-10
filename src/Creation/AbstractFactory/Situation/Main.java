package Creation.AbstractFactory.Situation;

public class Main {
    public static void main(String[] args) {
        Ship blackShip = new BlackShip();
        blackShip.setMotor(new BlackShipMotor());
        blackShip.setDeck(new BlackShipDeck());
        blackShip.setAnchor(new BlackShipAnchor());
        blackShip.operate();

        Ship whiteShip = new WhiteShip();
        whiteShip.setMotor(new WhiteShipMotor());
        whiteShip.setAnchor(new WhiteShipAnchor());
        whiteShip.setDeck(new WhiteShipDeck());
        whiteShip.operate();

        // 문제점 : 상황에 따라 다르지만, 최악의 경우, 부품 교체를 위해 모든 line 을 고쳐야 한다.
        // blackShip.setMotor(new WhiteShipMotor());
        // blackShip.setDeck(new WhiteShipDeck());
        // blackShip.setAnchor(new WhiteShipAnchor());
        // 즉, 개방 폐쇄 원칙에 어긋나고, 배를 생성하는 클래스가(보통 Factory) Client 에 과의존하게 된다.

        // 추상 팩토리 패턴을 쓰면, 일괄로 부품 조합(ConcreteFactory)을 전달하기만 하면 된다. (OCP)

        // 한 상황을 예로 들어 비교해보자.
        // 가령, blackShip 에 (WMotor, WAnchor, BDeck)을 전달하고 싶다면(요구사항 변화, Client 클래스의 변화), 그것에 해당하는

        // 기존 코드의 경우
        // blackShip.setMotor(new WhiteShipMotor());
        // blackShip.setAnchor(new WhiteShipAnchor());
        // blackShip.setDeck(new BlackShipDeck());
        // 총 3줄을 수정해야 한다.

        // 추상 팩토리의 경우
        // ConcreteFactory 하나를 추가한다. (확장) 그리고 그것의 부품 조합은 (WMotor, WAnchor, BDeck)이다.
        // blackShip.setPartFactory(new ConcreteFactory());
        // 클래스 하나를 확장하고, 기존 코드 1줄을 수정하였다.

        // 이처럼 추상 팩토리를 쓰면 일반적 상황에서 OCP 를 만족시키고, 결합도를 낮춘다.
    }
}
