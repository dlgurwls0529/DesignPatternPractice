package Behavior.Iterator._02_advanced;

import java.util.List;

public class SequentialIteratorB implements Iterator {

    private final List<Item> items;
    private int cursor;

    public SequentialIteratorB(List<Item> items) {
        this.items = items;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return items.size() != cursor;
    }

    @Override
    public boolean hasPrev() {
        return cursor != -1;
    }

    @Override
    public void set(Object o) {
        items.set(cursor, (Item) o);
    }

    @Override
    public void remove() {
        items.remove(cursor);
    }

    @Override
    public Object next() {
        return items.get(cursor++);
    }

    @Override
    public Object prev() {
        return items.get(cursor--);
    }

    @Override
    public int getCursor() {
        return this.cursor;
    }

    public Iterator iterator() {
        return new SequentialIteratorB(this.items);
    }
}
