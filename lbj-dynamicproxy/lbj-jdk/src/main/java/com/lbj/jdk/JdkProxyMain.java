package com.lbj.jdk;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Date 2021/2/24 16:19
 * @File JdkProxyMain
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class JdkProxyMain {
    public static void main(String[] args) {
        // 创建对象
        SaleComputer saleComputer = new Lenovo();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();

        // 增强对象
        SaleComputer saleComputerProxy = (SaleComputer) Proxy.newProxyInstance(saleComputer.getClass().getClassLoader(),
                saleComputer.getClass().getInterfaces(), myInvocationHandler);
        // 调用方法
        System.out.println(saleComputer.sale(100));
        System.out.println("---------------------");
        saleComputer.show();
    }
}
