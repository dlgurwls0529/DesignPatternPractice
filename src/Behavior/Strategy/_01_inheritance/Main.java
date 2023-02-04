package Behavior.Strategy._01_inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new HappyHourPolicyCustomer();
        customer.add(1.0, 2)
                .add(20.0, 3)
                .add(3.0, 1)
                .printBill();
    }
}
