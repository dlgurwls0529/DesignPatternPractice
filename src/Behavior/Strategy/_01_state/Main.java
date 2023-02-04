package Behavior.Strategy._01_state;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.add(1.0, 2, Customer.Mode.FREE)
                .add(20.0, 3, Customer.Mode.HAPPYHOUR)
                .add(3.0, 1, Customer.Mode.HAPPYHOUR)
                .printBill();
    }
}
