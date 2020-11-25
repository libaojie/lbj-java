package com.lbj.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
增强对象的功能：
    设计模式：一些通用的解决固定问题的方式
    代理模式
    概念：
    （1）. 真实对象：被代理的对象
    （2）. 代理对象：
    （3）. 代理模式：代理对象代理真实对象，达到增强真实对象功能的目的
    实现方式：
    （1）. 静态代理：有一个类文件描述代理模式
    （2）. 动态代理：在内存中形成代理类
    动态代理实现步骤：
    ①. 代理对象和真实对象实现相同的接口
    ②. 代理对象 = Proxy.newProxyInstance();
    ③. 使用代理对象调用方法。
    ④. 增强方法

 */

public class ProxyTest {

    public static void main(String[] args) {
        // 1.创建对象
        final Lenovo lenovo = new Lenovo();

        // 2、动态代理增强对象
        SaleComputer saleComputer = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("经过了代理商");

                if (method.getName().equals("sale")) {
                    // 1、增强参数
                    double money = (Double) (args[0]);
                    money += 10; // 加价手续费
                    System.out.println("代理商加价了");
                    return method.invoke(lenovo, money);


                } else {
                    Object obj = method.invoke(lenovo, args);
                    System.out.println("单纯代理！");
                    return obj;
                }

            }
        });

        // 3.调用方法
//        System.out.println(lenovo.sale(100));
        System.out.println(saleComputer.sale(100));
        System.out.println("---------------------");
        saleComputer.show();
//        saleComputer.show();

    }
}
