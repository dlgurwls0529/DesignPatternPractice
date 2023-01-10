package Creation.Prototype._03;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setName("redCar");
        car1.setSpeed("10");

        // 그냥 복사
        // 클론에이블 구현하고, 거기서 오버라이딩하면, 예외 안던집
        // 클론에이블은 클론 기능을 지원하는지 아닌지 유무라서
        // 지원이 안되면 컴파일 에러가 뜸

        //
        Car car2 = (Car) car1.clone();

        System.out.println(car1.equals(car2));

    }
}
