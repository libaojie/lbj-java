package com.lbj.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Description TODO
 * @Date 2021/2/24 15:47
 * @File CglibProxy
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class CglibProxyMain {
    public static void main(String[] args) {
        // 在指定目录下生成动态代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\04_code\\github\\self\\lbj-java\\lbj-cglib\\src\\test\\cglib");
        // 创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置目标类的字节码文件
        enhancer.setSuperclass(Dog.class);
        // 设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        // 正式创建代理类
        Dog dog = (Dog)enhancer.create();
        // 调用方法
        dog.run("123");
        dog.eat();
    }
}
