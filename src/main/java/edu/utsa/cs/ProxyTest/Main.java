package edu.utsa.cs.ProxyTest;

import java.lang.reflect.Proxy;

public class Main {
    public void execute(String[] args){
        ProxyAPI proxyInstance = (ProxyAPI) Proxy.newProxyInstance(
                ProxyClass.class.getClassLoader(),
                new Class[] { ProxyAPI.class },
                new ProxyClass());
        proxyInstance.methodA();
    }

    public static void main(String[] args){
        Main mainObject = new Main();
        mainObject.execute(args);
    }
}
