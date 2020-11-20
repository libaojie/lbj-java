package com.lbj.a4.static1;

/**
 * @Classname StaticDemo
 * @Description TODO
 * @Date 2020/6/29 19:09
 * @Created by libaojie
 */
public class StaticDemo {

    public static int value = 0;

    public static void main(String[] args) {

        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(staticDemo1.value);

        staticDemo1.value += 1;
        System.out.println(staticDemo1.value);

        StaticDemo staticDemo2 = new StaticDemo();
        System.out.println(staticDemo2.value);

        System.out.println(StaticDemo.value);

    }
}
