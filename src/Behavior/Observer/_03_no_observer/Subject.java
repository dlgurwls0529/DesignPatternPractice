package Behavior.Observer._03_no_observer;

public class Subject {
    private String state1;
    private String state2;
    private String state3;

    // event
    public void onEvent(String state1, String state2, String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
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
