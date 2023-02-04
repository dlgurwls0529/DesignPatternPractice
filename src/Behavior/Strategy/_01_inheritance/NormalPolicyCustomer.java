package Behavior.Strategy._01_inheritance;

public class NormalPolicyCustomer extends Customer {
    @Override
    public Customer add(double price, int quantity) {
        return super.add(price, quantity);
    }
}
