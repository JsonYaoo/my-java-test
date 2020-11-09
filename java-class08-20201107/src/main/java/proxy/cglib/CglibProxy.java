/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy<T> implements MethodInterceptor {

    T target;

    public T getProxy(T target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB动态代理拦截开始!");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB动态代理拦截结束!");
        return result;
    }
}
