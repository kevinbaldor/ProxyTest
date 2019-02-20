package edu.utsa.cs.ProxyTest;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        System.out.println("ProxyTest");
        ProxyAPI proxyInstance = (ProxyAPI) Proxy.newProxyInstance(
                ProxyClass.class.getClassLoader(),
                new Class[] { ProxyAPI.class },
                new ProxyClass());

        proxyInstance.methodA();
    }
}
