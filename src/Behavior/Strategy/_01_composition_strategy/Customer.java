package Behavior.Strategy._01_composition_strategy;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    protected final List<Double> drinks;

    public Customer() {
        this.drinks = new LinkedList<>();
    }

    public Customer add(double price, int quantity, BillingStrategy strategy) {
        double value = strategy.add(price, quantity);
        drinks.add(value);
        return this;
    }

    public void printBill() {
        double sum = 0;
        for (double i : drinks) {
            sum += i;
        }
        System.out.println("total due : " + sum);
        drinks.clear();
    }
}
