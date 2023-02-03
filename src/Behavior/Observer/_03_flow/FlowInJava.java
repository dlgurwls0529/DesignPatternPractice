package Behavior.Observer._03_flow;

import Structure.Facade._01_after.SubSystem1;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {
    public static void main(String[] args) throws InterruptedException {
        // event source

        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("hellow flow 1");
                subscriber.onNext("hellow flow 2");
                subscriber.onNext("hellow flow 3");
                subscriber.onComplete();
            }
        };

        publisher = new SubmissionPublisher<>();

        // event handler
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("OnSubscribe!");
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext");
                System.out.println(Thread.currentThread().getName());
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
        ((SubmissionPublisher)publisher).submit("hello sub");
        ((SubmissionPublisher)publisher).submit("hello sub1");
        System.out.println("end");
        Thread.sleep(3000);
    }
}
