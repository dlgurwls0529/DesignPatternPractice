package Behavior.Observer._03_push_abstract_observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observerList;
    private String state1;
    private String state2;
    private String state3;
    private boolean changed;

    public Subject() {
        observerList = new ArrayList<>();
        changed = false;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void onEvent(String state1, String state2, String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
        setChanged();
        // control back pressure
        notifyObserver();
    }

    private void notifyObserver() {
        if(changed) {
            for(Observer observer : observerList) {
                observer.update(state1, state2, state3);
            }
            changed = false;
        }
        else {
            System.out.println("not changed");
        }
    }

    private void setChanged() {
        this.changed = true;
    }
}
