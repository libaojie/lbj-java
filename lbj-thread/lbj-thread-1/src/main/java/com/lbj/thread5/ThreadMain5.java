package com.lbj.thread5;

import java.util.concurrent.locks.LockSupport;

public class ThreadMain5 {

    public static void main(String[] args) {

        Thread5 thread1 = new Thread5(0);
        thread1.start();

        Thread5 thread2 = new Thread5(1);
        thread2.start();

        Thread5 thread3 = new Thread5(2);
        thread3.start();

        thread1.setThread(thread2);
        thread2.setThread(thread3);
        thread3.setThread(thread1);

        LockSupport.unpark(thread1);


    }
}


