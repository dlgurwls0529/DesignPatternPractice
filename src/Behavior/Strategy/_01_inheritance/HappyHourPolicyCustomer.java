package Behavior.Strategy._01_inheritance;

public class HappyHourPolicyCustomer extends Customer {
    @Override
    public Customer add(double price, int quantity) {
        super.drinks.add(price * quantity * 0.5);
        return this;
    }
}
