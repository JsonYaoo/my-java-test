/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JdkProxy<T> implements InvocationHandler {

    T target;

    public T getProxy(T target) {
        this.target = target;

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理拦截开始！");
        Object result =  method.invoke(target, args);
        System.out.println("JDK动态代理拦截结束！");
        return result;
    }
}
