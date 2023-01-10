package Structure.Proxy._04_after;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject1 proxy1 = (Subject1) Proxy.newProxyInstance(
                Subject1.class.getClassLoader(),
                new Class[]{Subject1.class},
                new InterceptInvocationHandler(new Subject1Impl())
        );

        proxy1.operation1Subject1();
        proxy1.operation2Subject1();

        Subject2 proxy2 = (Subject2) Proxy.newProxyInstance(
                Subject2.class.getClassLoader(),
                new Class[]{Subject2.class},
                new InterceptInvocationHandler(new Subject2Impl())
        );

        proxy2.operation1Subject2();
        proxy2.operation2Subject2();

        /*Object proxy3 = Proxy.newProxyInstance(
                , ...
                new Class[]{Subject1.class, Subject2.class},
                new InterceptInvocationHandler(new Subject1Impl())
        );

        ((Subject1)proxy3).operation1Subject1();
        ((Subject1)proxy3).operation2Subject1();
        ((Subject2)proxy3).operation2Subject2();
        ((Subject2)proxy3).operation2Subject2();*/
    }
}
