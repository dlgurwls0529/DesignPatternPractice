package Behavior.Strategy._01_composition_strategy;

public class HappyHourStrategy implements BillingStrategy {
    @Override
    public double add(double price, int quantity) {
        return price * quantity * 0.5;
    }
}
