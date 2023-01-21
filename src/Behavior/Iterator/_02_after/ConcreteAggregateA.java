package Behavior.Iterator._02_after;

public class ConcreteAggregateA {

    private Item[] items;

    public ConcreteAggregateA() {
        this.items = new Item[0];
    }

    private Item[] getContainer() {
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

    public Iterator getSequentialIterator() {
        return new SequentialIteratorA(items);
    }

    public Iterator getReverseIterator() {
        return new ReverseIteratorA(items);
    }
}
