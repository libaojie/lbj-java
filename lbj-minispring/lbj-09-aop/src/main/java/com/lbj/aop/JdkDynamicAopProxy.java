package com.lbj.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JdkDynamicAopProxy
 * @Description 基于jdk的动态代理
 * @Date 2021/1/28 15:07
 * @Created by lbj
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {

    private AdvisedSupport advisedSupport;

    public JdkDynamicAopProxy(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), advisedSupport.getTargetSource().getTargetClass(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advisedSupport.getMethodInterceptor();
        if (advisedSupport.getMethodMatcher() != null
                && advisedSupport.getMethodMatcher().matches(method, advisedSupport.getTargetSource().getTarget().getClass())) {
            return methodInterceptor.invoke(new ReflectiveMethodInvocation(advisedSupport.getTargetSource().getTarget(),
                    method, args));
        } else {
            return method.invoke(advisedSupport.getTargetSource().getTarget(), args);
        }
    }
}
