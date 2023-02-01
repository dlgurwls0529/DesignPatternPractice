package Behavior.Observer._03_push_abstract_observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();

        // pull 에서는 옵저버가 서브젝트 알아야 하니까
        // 서브젝트에도 인터페이스 쓰는게 필요하지만, push 는
        // 옵저버의 상태를 바꾸는 게 아니라면,
        // 굳이 쓸 이유가 없는 듯 하다.
        // 물론 상황에 따라 다르겠지만.

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.onEvent("a", "b", "c");
        subject.onEvent("d", "e", "f");
        subject.onEvent("u", "c", "k");
    }
}
