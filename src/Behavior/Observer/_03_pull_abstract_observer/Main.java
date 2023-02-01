package Behavior.Observer._03_pull_abstract_observer;

public class Main {
    public static void main(String[] args) {
        // push 에서는 각 상태들에 의존했다.
        // pull 은 객체 자체를 필드로 넘긴다.
        // 강하게 결합하여, 메시지로써 상태를 딱 맞게 탐색할 수 있지만
        // 옵저버가 Subject 에 의존하게 된다.

        Subject subject = new Subject();
        Observer observer1 = new Observer1(subject);
        Observer observer2 = new Observer2(subject);
        Observer observer3 = new Observer3(subject);

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.onEvent("a", "b", "c");
        subject.onEvent("d", "e", "f");
        subject.onEvent("g", "h", "i");
        subject.onEvent("j", "k", "l");

    }
}
