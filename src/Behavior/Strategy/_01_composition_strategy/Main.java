package Behavior.Strategy._01_composition_strategy;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.add(1.0, 2, new FreeStrategy())
                .add(20.0, 3, new FreeStrategy())
                .add(3.0, 1, new HappyHourStrategy())
                .printBill();
    }
}
