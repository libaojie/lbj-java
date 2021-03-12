package com.lbj.string;

/**
 * @description 测试Stringnew的位置
 * @Date 2021/2/24 11:28
 * @File StringNewDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class StringNewDemo {
    public static void main(String[] args) {

        String s1 = "12345";
        System.out.println(s1.hashCode());

        String s2 = new String("12345");
        System.out.println(s2.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.intern());
        System.out.println(s2.intern());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        Integer i = new Integer(93);
        System.out.println(i.hashCode());
    }
}
