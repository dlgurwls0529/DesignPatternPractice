package Behavior.Iterator._02_advanced;

import Behavior.Iterator._02_after.ReverseIteratorA;

public class ConcreteAggregateA {

    private Item[] items;

    public ConcreteAggregateA() {
        this.items = new Item[0];
    }

    public void addItem(Item item) {
        Item[] new_items = new Item[items.length + 1];

        for(int i = 0; i < items.length; i++) {
            new_items[i] = items[i];
        }

        new_items[items.length] = item;
        this.items = new_items;
    }

    public Iterator iterator() {
        return new SequentialIteratorA(this.items);
    }
}
