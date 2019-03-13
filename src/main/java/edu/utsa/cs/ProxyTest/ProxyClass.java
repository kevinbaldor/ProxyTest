package edu.utsa.cs.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("methodB")) {
            IndirectCall ic = new IndirectCall();
            ic.call();
        } else {
            System.out.println("Do nothing");
        }
        return 0;
    }
}
