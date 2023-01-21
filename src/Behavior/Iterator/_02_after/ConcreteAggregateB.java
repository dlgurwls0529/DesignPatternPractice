package Behavior.Iterator._02_after;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateB {

    private final List<Item> list;

    public ConcreteAggregateB() {
        this.list = new ArrayList<>();
    }

    private List<Item> getContainer() {
        return new ArrayList<>(this.list);
    }

    public void addItem(Item item) {
        list.add(item);
    }

    public Iterator getSequentialIterator() {
        return new SequentialIteratorB(list);
    }
}
