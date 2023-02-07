package Behavior.Visitor._01_before;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.printTo(new Phone());
        rectangle.printTo(new Watch());

        Shape triangle = new Triangle();
        triangle.printTo(new Phone());
        triangle.printTo(new Watch());

        // 여기에 있는 Device 인터페이스가 상태 패턴 적용 전에서 State enum 이랑 같다.
    }
}
