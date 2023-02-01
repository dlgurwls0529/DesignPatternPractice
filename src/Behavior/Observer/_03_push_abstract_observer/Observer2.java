package Behavior.Observer._03_push_abstract_observer;

public class Observer2 implements Observer {
    public void display(String state1, String state2, String state3) {
        String prefix = "[Observer2]";
        System.out.println(prefix + " state1 : " + state1);
        System.out.println(prefix + " state2 : " + state2);
        System.out.println(prefix + " state3 : " + state3);
    }

    @Override
    public void update(String state1, String state2, String state3) {
        display(state1, state2, state3);
    }
}
