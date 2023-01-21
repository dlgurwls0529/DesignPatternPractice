package Behavior.Iterator._02_advanced;

import Behavior.Iterator._02_after.Iterator;
import Behavior.Iterator._02_after.SequentialIteratorB;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateB {

    private final List<Item> list;

    public ConcreteAggregateB() {
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        list.add(item);
    }

}
