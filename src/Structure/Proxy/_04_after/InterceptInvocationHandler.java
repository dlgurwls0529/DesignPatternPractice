package Structure.Proxy._04_after;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;

public class InterceptInvocationHandler implements InvocationHandler {
    private Object subject;

    public InterceptInvocationHandler(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HashSet<String> hashSet = new HashSet<>(List.of(PointCutContainer.strings));

        if(hashSet.contains(method.getName())) {
            System.out.println("intercept_point_cut_begin : " + method.getName());
            Object invoke = method.invoke(subject, args);
            System.out.println("intercept_point_cut_end : " + method.getName());
            System.out.println("");
            return invoke;
        }
        else {
            System.out.println("intercept_not_point_cut_begin : " + method.getName());
            Object invoke = method.invoke(subject, args);
            System.out.println("intercept_not_point_cut_end : " + method.getName());
            System.out.println("");
            return invoke;
        }
    }
}
