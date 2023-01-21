package Behavior.Iterator._02_before;

import java.util.*;

public class ConcreteAggregateA {

    private Item[] items;

    public ConcreteAggregateA() {
        this.items = new Item[0];
    }

    public Item[] getContainer() {
        Item[] ret_items = new Item[items.length];

        for(int i = 0; i < items.length; i++) {
            ret_items[i] = items[i];
        }

        return ret_items;
    }

    public void addItem(Item item) {
        Item[] new_items = new Item[items.length + 1];

        for(int i = 0; i < items.length; i++) {
            new_items[i] = items[i];
        }

        new_items[items.length] = item;
        this.items = new_items;
    }
}
