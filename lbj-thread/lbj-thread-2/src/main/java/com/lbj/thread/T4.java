package com.lbj.thread;

/**
 * 多线程操作同一变量： 使用Synchronized 保证同步
 * Synchronized既保证了原子性，又保证了可见性，所以不用加volatile
 */
public class T4 implements Runnable{

    private int count = 0;

    @Override
    public synchronized void run() {
        count++;
        System.out.println(Thread.currentThread().getName()+" "+count);
    }

    public static void main(String[] args) {
        T4 t = new T4();
        // 创建100个线程
        for (int i = 0; i < 100; i++){
            new Thread(t, "Thread"+i).start();
        }
    }
}
