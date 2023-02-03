package Behavior.Observer._03_backpressure;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observerList;
    private String state1;
    private String state2;
    private String state3;
    private boolean changed;
    private long pre_time;

    public Subject() {
        observerList = new ArrayList<>();
        changed = false;
        pre_time = System.currentTimeMillis();
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

        // 시간을 측정한다.
        long cur_time = System.currentTimeMillis();

        // 이전 이벤트 실행 시간이랑 1000 밀리초 이상 차이나면 변화 플래그 True
        // 그리고 이전 이벤트 실행 시간을 갱신
        if(cur_time - pre_time > 1000) {
            setChanged();
            pre_time = cur_time;
        }

        // control back pressure
        notifyObserver();
    }

    private void notifyObserver() {
        if(changed) {
            for(Observer observer : observerList) {
                observer.update();
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

    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }

    public String getState3() {
        return state3;
    }
}
