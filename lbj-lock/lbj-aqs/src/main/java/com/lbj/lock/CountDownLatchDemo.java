package com.lbj.lock;

import java.util.concurrent.CountDownLatch;

/**
 * @Description TODO
 * @Date 2021/4/13 20:06
 * @File CountDownLatchDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class CountDownLatchDemo {
    public volatile static int num = 0;
    public static void main(String[] args) {
        int size = 50;
        final CountDownLatch cdl = new CountDownLatch(size);
        for (int i = 0; i < size; i++) {
            new Thread(){
                public void run(){
                    CountDownLatchDemo.num += 1;
                    cdl.countDown();
                }
            }.start();
        }

        try {
            cdl.await();
            // 批量处理完毕处理完毕
            System.out.println(CountDownLatchDemo.num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
