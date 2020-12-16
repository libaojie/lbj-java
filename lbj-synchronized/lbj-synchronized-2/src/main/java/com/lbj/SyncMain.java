package com.lbj;

/**
 *  异常锁
 *  同步逻辑出现问题，产生异常后，自动释放锁
 */
public class SyncMain {

    int count = 0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+" start");
        while(true){
            count++;
            System.out.println(Thread.currentThread().getName() +" count="+count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5){
                int i = 1/0; // 此处抛出异常，锁将被释放，可以在这里进行catch， 然后循环继续。
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SyncMain syncMain = new SyncMain();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                syncMain.m();
            }
        };
        new Thread(r, "t1").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(r, "t2").start();
    }
}
