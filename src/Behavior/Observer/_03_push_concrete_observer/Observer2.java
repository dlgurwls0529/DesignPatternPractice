package Behavior.Observer._03_push_concrete_observer;

public class Observer2 {
    public void update2(String state1, String state2, String state3) {
        display(state1, state2, state3);
    }

    public void display(String state1, String state2, String state3) {
        System.out.println();
        System.out.println("state1 : " + state1);
        System.out.println("state2 : " + state2);
        System.out.println("state3 : " + state3);
    }
}
