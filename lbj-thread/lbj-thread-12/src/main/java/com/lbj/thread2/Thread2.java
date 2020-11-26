package com.lbj.thread2;

import com.lbj.thread1.Thread1;

public class Thread2 extends Thread{

    private int id;
    private static int cnt = 0;
    public Thread2(int id){
        this.id = id;
    }


    @Override
    public void run() {

        while (cnt <= 100){
            // 可以保证只有一个线程可以执行，使用synchronize保证可见性
            synchronized (Thread2.class){
                if (cnt % 2 == id){
                    System.out.println("id:"+id+", numb:"+cnt);
                    cnt++;
                }
            }

        }


    }
}
