package Behavior.Observer._03_no_observer;

public class Observer3 implements Runnable {
    private final Subject subject;
    private final long freq;

    public Observer3(Subject subject) {
        this.subject = subject;
        this.freq = 1000;
    }

    @Override
    public void run() {
        while (true) {
            display(subject.getState1(),
                    subject.getState2(),
                    subject.getState3());

            try {
                Thread.sleep(freq);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void display(String state1, String state2, String state3) {
        String prefix = "[Observer3]";
        System.out.println(prefix + " state1 : " + state1);
        System.out.println(prefix + " state2 : " + state2);
        System.out.println(prefix + " state3 : " + state3);
    }
}
