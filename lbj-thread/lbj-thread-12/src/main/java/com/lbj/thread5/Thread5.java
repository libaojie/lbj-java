package com.lbj.thread5;

/**
 * 三个线程 轮询
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread5 extends Thread {

    private int id;
    private static int cnt = 0;

    private static Lock lock = new ReentrantLock();

    // 这时候lock中condition的优势就体现出来了，它可以通过设置不同的condition来实现不同线程的精确唤醒
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();

    public Thread5(int id) {
        this.id = id;
    }


    @Override
    public void run() {

        while (cnt <= 100) {
            lock.lock();

            System.out.println("id:" + id + ", numb:" + cnt);
            cnt++;

            condition1.signal();

            try {
                condition1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.unlock();
        }


    }
}
