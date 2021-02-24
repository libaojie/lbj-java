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
        System.out.println("a++: "+(a++));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("++a: "+(++a));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("a++/b++: "+(a++/b++));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("++a/++c: "+(++a/++c));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("a++ + ++c: "+(a++ + ++c));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("a++ + a++ + ++c: "+(a++ + a++ + ++c));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));
        System.out.println("a++ * a++ * ++c: "+(a++ * a++ * ++c));
        System.out.println(String.format("a:{%s}, b:{%s}, c:{%s}",a,b,c));

        System.out.println("-----------------");
        int x = 3;
        System.out.println(String.format("x:{%s}",x));
        System.out.println("3<<1: "+(3<<1));
        System.out.println("3<<2: "+(3<<2));
        x=64;
        System.out.println(String.format("x:{%s}",x));
        System.out.println("64>>1: "+(64>>1));
        System.out.println("64>>2: "+(64>>2));
        System.out.println("64>>3: "+(64>>3));
        x=64;
        System.out.println(String.format("x:{%s}",x));
        System.out.println("64>>>1: "+(64>>>1));
        System.out.println("64>>>8: "+(64>>>8));

        System.out.println("-----------------");
        System.out.println("& 与: 两个操作数中位都为1，结果才为1，否则结果为0");
        int m = 0;
        int n = 1;
        System.out.println(String.format("m:{%s}, n:{%s}",m,n));
        System.out.println("m&n: "+(m&n));
        m = 2; // 10
        n = 3; // 11
        System.out.println(String.format("m:{%s}, n:{%s}",m,n));
        System.out.println("m&n: "+(m&n));

        System.out.println("-----------------");
        System.out.println("| 或: 两个位只要有一个为1，那么结果就是1，否则就为0");
        m = 0;
        n = 1;
        System.out.println(String.format("m:{%s}, n:{%s}",m,n));
        System.out.println("m|n: "+(m|n));
        m = 2; // 10
        n = 3; // 11
        System.out.println(String.format("m:{%s}, n:{%s}",m,n));
        System.out.println("m|n: "+(m|n));


        System.out.println("-----------------");
        System.out.println("~ 非: 如果位为0，结果是1，如果位为1，结果是0");
        m = 2; // 10 => 01 => -3
        System.out.println(String.format("m:{%s}",m));
        System.out.println("~m: "+(~m));

        System.out.println("-----------------");
        System.out.println("^ 异或: 两个操作数的位中，相同则结果为0，不同则结果为1");
        m = 4; // 100
        n = 6; // 110 => 010  => 2
        System.out.println(String.format("m:{%s}, n:{%s}",m,n));
        System.out.println("m^n: "+(m^n));
    }

}
