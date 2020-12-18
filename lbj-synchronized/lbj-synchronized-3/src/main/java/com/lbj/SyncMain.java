package com.lbj;

/**
 * Synchronized优化
 * 同步代码块中的语句越少越好
 * 比较m1和m2
 */
public class SyncMain {

    int count = 0;
    synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"   m1 start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 业务逻辑中只有这句需要sync
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"   m1 end");

    }

    void m2(){
        System.out.println(Thread.currentThread().getName()+"   m2 start");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 业务逻辑中只有这句需要sync
        // 采用细粒度的锁，可以使线程争用时间变短，从而提高效率
        synchronized (this){
            count++;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"   m2 end");

    }


    public static void main(String[] args) {
        SyncMain t1 = new SyncMain();
        SyncMain t2 = new SyncMain();

//        new Thread(t2::m2, "t2").start();
        new Thread(t1::m1, "t1").start();
        new Thread(t1::m1, "t2").start();

    }


}
