package com.lbj.thread4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread4 extends Thread {

    private int id;
    private static int cnt = 0;

    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public Thread4(int id) {
        this.id = id;
    }


    @Override
    public void run() {

        while (cnt <= 100) {
            lock.lock();

            System.out.println("id:" + id + ", numb:" + cnt);
            cnt++;

            condition.signal();

            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.unlock();
        }


    }
}
