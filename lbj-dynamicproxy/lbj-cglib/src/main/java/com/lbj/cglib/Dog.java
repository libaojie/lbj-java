package com.lbj.cglib;

/**
 * @Description TODO
 * @Date 2021/2/24 15:43
 * @File Dog
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Dog {
    public void eat(){
        System.out.println("dog -- eat");
    }

    final public void run(String name){
        System.out.println("dog "+ name+ " -- run");
    }
}
