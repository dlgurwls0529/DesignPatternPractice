package Behavior.Iterator._02_after;

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

        /*
        원래는 접근 방식이 바뀌거나 접근 컨테이너가 바뀌면 반복문 엎어야 했다.
        근데 이렇게 하면 한줄만 바꿔줘도 된다. 그리고 나머지는 새로운 이터레이터나 클래스 등을 만드는 것.
         */

        Iterator iterator = concreteAggregateA.getSequentialIterator();
        while(iterator.hasNext()) {
            System.out.println(((Item)iterator.next()).getContent());
        }

        Iterator iterator1 = concreteAggregateA.getReverseIterator();
        while(iterator1.hasNext()) {
            System.out.println(((Item)iterator1.next()).getContent());
        }

        Iterator iterator2 = concreteAggregateB.getSequentialIterator();
        while(iterator2.hasNext()) {
            System.out.println(((Item)iterator2.next()).getContent());
        }

    }
}
