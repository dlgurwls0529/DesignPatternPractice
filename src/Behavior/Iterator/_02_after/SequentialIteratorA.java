package Behavior.Iterator._02_after;

import Behavior.Iterator._02_after.Item;

public class SequentialIteratorA implements Iterator {

    private final Item[] items;
    private int cursor;

    public SequentialIteratorA(Item[] items) {
        this.items = items;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return items.length != cursor;
    }

    @Override
    public Object next() {
        return items[cursor++];
    }
}
