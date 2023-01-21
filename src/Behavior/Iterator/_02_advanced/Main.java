package Behavior.Iterator._02_advanced;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregateA concreteAggregateA = new ConcreteAggregateA();
        concreteAggregateA.addItem(new Item("content 1"));
        concreteAggregateA.addItem(new Item("content 2"));
        concreteAggregateA.addItem(new Item("content 3"));
        concreteAggregateA.addItem(new Item("content 4"));
        concreteAggregateA.addItem(new Item("content 5"));

        ConcreteAggregateB concreteAggregateB = new ConcreteAggregateB();
        concreteAggregateB.addItem(new Item("content 1"));
        concreteAggregateB.addItem(new Item("content 2"));
        concreteAggregateB.addItem(new Item("content 3"));
        concreteAggregateB.addItem(new Item("content 4"));
        concreteAggregateB.addItem(new Item("content 5"));

        Iterator iterator = concreteAggregateA.iterator();
        while(iterator.hasNext()) {
            if(iterator.getCursor() > 3) {
                iterator.set(new Item("test"));
            }
            iterator.next();
        }

        while(iterator.hasPrev()) {
            System.out.println(((Item)iterator.prev()).getContent());
        }



    }
}
