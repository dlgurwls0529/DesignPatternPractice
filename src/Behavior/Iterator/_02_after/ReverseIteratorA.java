package Behavior.Iterator._02_after;

import Behavior.Iterator._02_after.Item;

public class ReverseIteratorA implements Iterator {

    private final Item[] items;
    private int cursor;

    public ReverseIteratorA(Item[] items) {
        this.items = items;
        this.cursor = items.length - 1;
    }

    @Override
    public boolean hasNext() {
        return cursor != -1;
    }

    @Override
    public Object next() {
        return items[cursor--];
    }
}
