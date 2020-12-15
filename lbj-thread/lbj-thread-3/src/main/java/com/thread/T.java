package com.thread;

/**
 * 同步方法与非同步方法是否能同时调用？
 */
public class T {

    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName() +" m1 start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" m1 end");
    }

    public void m2(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" m2 end");
    }

    public synchronized void m3(){
        System.out.println(Thread.currentThread().getName() +" m3 start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" m3 end");
    }


    public static void main(String[] args) {
        T t1 = new T();
        new Thread(t1::m1, "t1：t1").start();
        new Thread(t1::m3, "t1：t3").start();
        new Thread(t1::m2, "t1：t2").start();

        T t2 = new T();
        new Thread(t2::m1, "t2：t1").start();
        new Thread(t2::m3, "t2：t3").start();
        new Thread(t2::m2, "t2：t2").start();
    }
}
/**
 同步方法与非同步方法是否能同时调用
 因为访问m1时进行加锁，但是m2的执行不需要锁。但是m3需要等m1的锁释放才执行


 sysnchronized锁的是new出来的对象，而不是类！！！

 */