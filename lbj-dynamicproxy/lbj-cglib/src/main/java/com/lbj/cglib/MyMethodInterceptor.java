package com.lbj.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2021/2/24 15:45
 * @File MyMethodInterceptor
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这里对对象进行增强");
        // 这里是方法调用，而不是反射
        Object object = methodProxy.invokeSuper(o, objects);
        return object;
    }
}
