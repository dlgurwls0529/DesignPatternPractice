package Behavior.State.stack_trace_test;

public class Caller3 {
    public void call3() {
        new Caller2().call2();
    }
}
