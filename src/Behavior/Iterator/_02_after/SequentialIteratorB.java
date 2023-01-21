package Behavior.Iterator._02_after;

import java.util.List;

public class SequentialIteratorB implements Iterator {

    private final List<Item> list;
    private int cursor;

    public SequentialIteratorB(List<Item> list) {
        this.list = list;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Object next() {
        return list.get(cursor++);
    }
}
