package Behavior.Strategy._01_composition_strategy;

public class NormalStrategy implements BillingStrategy {
    @Override
    public double add(double price, int quantity) {
        return price * quantity;
    }
}
