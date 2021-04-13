package com.lbj.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * @Description TODO
 * @Date 2021/4/9 8:45
 * @File LockSupportDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        Thread parkThread = new Thread(new ParkThread());
        parkThread.start();
        System.out.println("开始线程唤醒");
        LockSupport.unpark(parkThread);
        System.out.println("结束线程唤醒");

    }

    static class ParkThread implements Runnable {

        @Override
        public void run() {
            System.out.println("开始线程阻塞");
            LockSupport.park();
            System.out.println("结束线程阻塞");
        }
    }
}
