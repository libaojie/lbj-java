package com.lbj.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多线程操作同一变量： 使用Atomic保证其原子性
 */
public class T3 implements Runnable{

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public  void run() {
        System.out.println(Thread.currentThread().getName()+" "+count.getAndIncrement());
    }

    public static void main(String[] args) {
        T3 t = new T3();
        // 创建100个线程
        for (int i = 0; i < 1000; i++){
            new Thread(t, "Thread"+i).start();
        }
    }
}
