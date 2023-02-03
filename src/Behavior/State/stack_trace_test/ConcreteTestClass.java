package Behavior.State.stack_trace_test;

public class ConcreteTestClass implements TestClass {
    @Override
    public void run() {
        System.out.println("test");
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getMethodName() + " : " +
                    stackTraceElement.getClassName());

            try {
                System.out.println(Class.forName(stackTraceElement.getClassName()).getInterfaces()[0].getName());
            } catch (ClassNotFoundException e) {
                System.out.println("not found");
            }
        }
    }
}
