package com.lbj.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2021/2/24 16:16
 * @File MyInvocationHandler
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("经过了代理商");

        if (method.getName().equals("sale")) {
            // 1、增强参数
            double money = (Double) (args[0]);
            money += 10; // 加价手续费
            System.out.println("代理商加价了");
            return method.invoke(proxy, money);
        } else {
            Object obj = method.invoke(proxy, args);
            System.out.println("单纯代理！");
            return obj;
        }
    }
}
