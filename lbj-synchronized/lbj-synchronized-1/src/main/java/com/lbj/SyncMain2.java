package com.lbj;

/**
 * 可重入锁 （同一线程同一对象重写函数）
 * 模拟一个父类子类的概念，父类synchronize，子类调用super.m的时候必须可重入
 * 否则就会出现问题（调用父类是同一把锁），所谓的重入锁就是你拿到这把锁之后不停的加锁加锁，
 * 加了好几道，但锁定的还是同一个对象，去一道就减掉1
 */
public class SyncMain2 {
    synchronized void m() {
        System.out.println("m start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new SyncMain2().m();
    }
}

class SyncChild extends SyncMain2 {

    @Override
    synchronized void m() {
        System.out.println("child m start");
        super.m();
        System.out.println("child m end");
    }
}
