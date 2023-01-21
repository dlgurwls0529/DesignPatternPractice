package Behavior.Iterator._02_advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequentialIteratorA implements Iterator {

    private Item[] items;
    private int cursor = 0;

    public SequentialIteratorA(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return cursor != items.length;
    }

    @Override
    public boolean hasPrev() {
        return cursor != -1;
    }

    @Override
    public void set(Object o) {
        this.items[cursor] = (Item) o;
    }

    @Override
    public void remove() {
        List<Item> list = new ArrayList<Item>(Arrays.asList(items));
        list.remove(cursor);
        items = (Item[]) list.toArray();
    }

    @Override
    public Object next() {
        if (cursor == items.length-1)
            return items[cursor];
        else
            return items[cursor++];
    }

    @Override
    public Object prev() {
        return items[cursor--];
    }

    @Override
    public int getCursor() {
        return this.cursor;
    }
}
