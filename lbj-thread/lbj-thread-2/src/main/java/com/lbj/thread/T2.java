package com.lbj.thread;
/**
 * 多线程操作同一变量： 使用volatile,保证了其可见性和有序性，无法保证原子性
 */
public class T2 implements Runnable{

    private volatile int count = 0;

    @Override
    public  void run() {
        count++;
        System.out.println(Thread.currentThread().getName()+" "+count);
    }

    public static void main(String[] args) {
        T2 t = new T2();
        // 创建100个线程
        for (int i = 0; i < 100; i++){
            new Thread(t, "Thread"+i).start();
        }
    }
}
