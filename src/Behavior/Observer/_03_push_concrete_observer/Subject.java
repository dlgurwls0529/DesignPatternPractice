package Behavior.Observer._03_push_concrete_observer;
public class Subject {
    private String state1;
    private String state2;
    private String state3;
    private final Observer1 observer1;
    private final Observer2 observer2;
    private final Observer3 observer3;
    private boolean changed;

    public Subject(Observer1 observer1, Observer2 observer2, Observer3 observer3) {
        this.changed = false;
        this.observer1 = new Observer1();
        this.observer2 = new Observer2();
        this.observer3 = new Observer3();
    }

    public void onEvent(String state1, String state2, String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;

        // 이거를 조건에 따라 호출하여 변화 전달률? 조절
        setChanged();

        notifyObservers();
    }

    private void setChanged() {
        this.changed = true;
    }

    public void notifyObservers() {
        if (changed) {
            observer1.update1(state1, state2, state3);
            observer2.update2(state1, state2, state3);
            observer3.update3(state1, state2, state3);
            changed = false;
        }
        else {
            System.out.println("not changed");
        }
    }
}
