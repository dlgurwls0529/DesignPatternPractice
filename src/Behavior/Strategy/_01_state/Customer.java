package Behavior.Strategy._01_state;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private final List<Double> drinks;

    enum Mode { NORMAL, HAPPYHOUR, FREE }

    public Customer() {
        this.drinks = new LinkedList<>();
    }

    public Customer add(double price, int quantity, Mode mode) {
        if (mode == Mode.NORMAL) {
            drinks.add(price * quantity);
        }
        else if (mode == Mode.FREE) {
            drinks.add(0.0);
        }
        else if (mode == Mode.HAPPYHOUR) {
            drinks.add(price * quantity * 0.5);
        }

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
