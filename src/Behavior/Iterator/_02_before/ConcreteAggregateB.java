package Behavior.Iterator._02_before;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateB {

    private final List<Item> list;

    public ConcreteAggregateB() {
        this.list = new ArrayList<>();
    }

    public List<Item> getContainer() {
        return new ArrayList<>(this.list);
    }

    public void addItem(Item item) {
        list.add(item);
    }
}
