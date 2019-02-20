package edu.utsa.cs.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoked method: "+ method.getName());

        return 42;
    }
}
