package Behavior.Observer._03_no_observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new Subject();
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);
        Observer3 observer3 = new Observer3(subject);

        Thread thread1 = new Thread(observer1);
        Thread thread2 = new Thread(observer2);
        Thread thread3 = new Thread(observer3);

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(4000);
        subject.onEvent("hello1", "hello2", "hello3");
        Thread.sleep(4000);
        subject.onEvent("good1", "good2", "good3");
        Thread.sleep(4000);
        subject.onEvent("bye1", "bye2", "bye3");
    }
}
