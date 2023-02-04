package Behavior.Strategy._01_plain;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private final List<Double> drinks;

    public Customer() {
        this.drinks = new LinkedList<>();
    }

    public Customer add(double price, int quantity) {
        drinks.add(price * quantity);
        // drinks.add(price * quantity * 0.5)
        // drinks.add(1000.0 * quantity)
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
