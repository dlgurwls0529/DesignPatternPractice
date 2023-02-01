package Behavior.Observer._03_push_concrete_observer;

public class Main {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();
        Subject subject = new Subject(observer1, observer2, observer3);

        subject.onEvent("a", "b", "c");
        subject.onEvent("d", "e", "f");
        subject.onEvent("u", "c", "k");
    }
}
