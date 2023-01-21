package Behavior.Iterator._02_before;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregateA concreteAggregateA = new ConcreteAggregateA();
        concreteAggregateA.addItem(new Item("content 1"));
        concreteAggregateA.addItem(new Item("content 2"));
        concreteAggregateA.addItem(new Item("content 3"));
        concreteAggregateA.addItem(new Item("content 4"));
        concreteAggregateA.addItem(new Item("content 5"));

        ConcreteAggregateB concreteAggregateB = new ConcreteAggregateB();
        concreteAggregateB.addItem(new Item("content 1"));
        concreteAggregateB.addItem(new Item("content 2"));
        concreteAggregateB.addItem(new Item("content 3"));
        concreteAggregateB.addItem(new Item("content 4"));
        concreteAggregateB.addItem(new Item("content 5"));

        for (int i = 0; i < concreteAggregateA.getContainer().length; i++) {
            System.out.println(concreteAggregateA.getContainer()[i].getContent());
        }

        for (int i = concreteAggregateA.getContainer().length - 1; i >= 0; i--) {
            System.out.println(concreteAggregateA.getContainer()[i].getContent());
        }

        for(int i = 0; i < concreteAggregateB.getContainer().size(); i++) {
            System.out.println(concreteAggregateB.getContainer().get(i).getContent());
        }

    }
}
