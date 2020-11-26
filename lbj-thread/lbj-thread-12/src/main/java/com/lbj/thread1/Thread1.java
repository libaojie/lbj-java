package com.lbj.thread1;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 extends Thread{

    private int id;
    // 保证其原子性
    private static AtomicInteger cnt = new AtomicInteger();
    public Thread1(int id){
        this.id = id;
    }


    @Override
    public void run() {

        // 不停轮询，是否达到条件
        while (cnt.get() <= 100){
            if (cnt.get() % 2 == id){
                System.out.println("id:"+id+", numb:"+cnt.get());
                cnt.incrementAndGet();
            }
        }


    }
}
