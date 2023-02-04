package Behavior.Strategy._01_plain;

public class Main {
    // 상속 - 구성
    // 위임은 구성하는 객체의 메소드로 호출
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.add(1.0, 2)
                .add(20.0, 3)
                .add(3.0, 1)
                .printBill();

        // 문제 상황 : 여러 전략을 사용할 수 있어야 한다.
        // 여러 전략(계산 알고리즘)을 쉽게 전환할 수 있어야 한다.
        // sol1 : if절 state
        // sol2 : inheritance
        // sol3 : 전략의 캡슐화와 composition
    }
}
