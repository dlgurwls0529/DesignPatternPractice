package Behavior.Observer._03_pull_abstract_observer;

public class Observer2 implements Observer {
    private final Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
    }

    public void display(String state1, String state2, String state3) {
        System.out.println("");
        System.out.println("state1 : " + state1);
        System.out.println("state2 : " + state2);
        System.out.println("state3 : " + state3);
    }

    @Override
    public void update() {
        display(subject.getState1(), subject.getState2(), subject.getState3());
    }
}
