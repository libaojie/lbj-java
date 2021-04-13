package com.lbj.lock;

/**
 * @Description 体现Synchronized可重入性
 * @Date 2021/4/13 14:46
 * @File SynchronizedReenDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class SynchronizedReenDemo extends Parent {

    // 体现子类重写父类方法的可重入性
    public synchronized int add(int value) {
        return 1000 + super.add(value);
    }

    public static void main(String[] args) {
        SynchronizedReenDemo demo = new SynchronizedReenDemo();
        System.out.println(demo.add(100));
    }

}

class Parent {
    public synchronized int get(int value) {
        return value;
    }

    public synchronized int add(int value) {
        // 体现方法间的可重入性
        return value + get(value);
    }
}

