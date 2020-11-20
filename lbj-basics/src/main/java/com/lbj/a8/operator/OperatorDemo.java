package com.lbj.a8.operator;

/**
 * @Classname OperatorDemo
 * @Description TODO
 * @Date 2020/7/24 9:57
 * @Created by libaojie
 */
public class OperatorDemo {


    public static void main(String[] args) {
        float a = 1f;
        float b = 2;
        float c = 3;

        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println(a++);
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println(++a);
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println(a++/b++);
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println(++a/++c);
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));

    }

}
