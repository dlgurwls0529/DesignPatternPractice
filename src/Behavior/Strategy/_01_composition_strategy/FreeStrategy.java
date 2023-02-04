package Behavior.Strategy._01_composition_strategy;

public class FreeStrategy implements BillingStrategy {
    @Override
    public double add(double price, int quantity) {
        return 0.0;
    }
}
