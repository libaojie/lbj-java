package com.lbj.thread;

/**
 * 多线程操作同一变量： 无法保证正确运算
 */
public class T1 implements Runnable{

    private int count = 0;

    @Override
    public  void run() {
        count++;
        System.out.println(Thread.currentThread().getName()+" "+count);
    }

    public static void main(String[] args) {
        T1 t = new T1();
        // 创建100个线程
        for (int i = 0; i < 100; i++){
            new Thread(t, "Thread"+i).start();
        }
    }
}
