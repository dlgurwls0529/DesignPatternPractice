package Behavior.State.stack_trace_test;

public class Caller2 {
    public void call2() {
        new Caller1().call1();
    }
}
