package bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author majiabao on 2017/11/26.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method :" + method.getName() + " start invoke!");
        Object result = method.invoke(target, args);
        System.out.println("method :" + method.getName() + " end invoke!");
        return result;
    }
}
