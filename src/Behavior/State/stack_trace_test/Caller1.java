package Behavior.State.stack_trace_test;

public class Caller1 {
    public void call1() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for(StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getMethodName());
        }

/*
        [0] getStackTrace
        [1] call1
        [2] call2
        [3] call3
        [4] main

        가장 나중에 호출된 애가 마지막에 있다.
        스택 프레임이 호출 때마다 global 하게 쌓인다.
*/

    }
}
