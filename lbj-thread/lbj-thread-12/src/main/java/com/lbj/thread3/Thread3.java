package com.lbj.thread3;

import com.lbj.thread1.Thread1;

public class Thread3 extends Thread {

    private int id;
    private static int cnt = 0;

    public Thread3(int id) {
        this.id = id;
    }


    @Override
    public void run() {

        while (cnt <= 100) {
            // 使用synchronize保证可见性
            synchronized (Thread3.class) {

                System.out.println("id:" + id + ", numb:" + cnt);
                cnt++;

                // 通知其他线程
                Thread3.class.notify();

                try {
                    // 等待通知
                    Thread3.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
