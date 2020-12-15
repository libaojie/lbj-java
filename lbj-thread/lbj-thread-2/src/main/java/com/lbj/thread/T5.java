package com.lbj.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程操作同一变量： 使用ReentrantLock 保证同步
 */
public class T5 implements Runnable{

    private  int count = 0;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();

        count++;
        System.out.println(Thread.currentThread().getName()+" "+count);

        lock.unlock();
    }

    public static void main(String[] args) {
        T5 t = new T5();
        // 创建100个线程
        for (int i = 0; i < 100; i++){
            new Thread(t, "Thread"+i).start();
        }
    }
}
