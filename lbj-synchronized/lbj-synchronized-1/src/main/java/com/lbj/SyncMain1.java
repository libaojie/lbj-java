package com.lbj;

/**
 * 可重入锁 （同一线程同一对象不同方法）
 * 一个同步方法可以调用另外一个同步方法，一个县城已经拥有某个对象的锁，再次申请的时候仍然会得到该对象的锁。
 * 也就是说synchronized获得锁是可重入锁
 */
public class SyncMain1 {

    private synchronized void m1(){
        System.out.println("m1 start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }
    private synchronized void m2(){
        System.out.println("m2 start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        new SyncMain1().m1();
    }
}
