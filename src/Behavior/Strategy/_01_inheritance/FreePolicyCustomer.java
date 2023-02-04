package Behavior.Strategy._01_inheritance;

public class FreePolicyCustomer extends Customer {
    @Override
    public Customer add(double price, int quantity) {
        super.drinks.add(0.0);
        return this;
    }
}
