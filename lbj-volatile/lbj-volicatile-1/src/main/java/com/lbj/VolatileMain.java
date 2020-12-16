package com.lbj;

/**
 * volatile关键字，使一个变量在多个线程间可见
 * AB线程都用到一个变量，java默认是A线程保留一份copy，这样如果B线程修改了该变量，则A线程未必知道
 *
 * 使用volatile关键字，会让所有线程都会读到该变量的修改值
 *
 * 在下面代码中，running是存在堆内存中读取running的值
 * 当子线程开始运行时，会吧running的值从内存中督导子线程的工作区中，在运行过程中直接使用这个copy，并不会每次去取。
 * 读取堆内存，这样，当主线程修改了running值之后，子线程感知不到，所以不会停止运行
 *
 * 使用volatile关键字，将会强制所有线程都去堆内存中读取值
 *
 *  使用volatile并不能保证多个线程共同修改running变量时所带来的不一致问题，也就是volatile无法替代synchronized
 */
public class VolatileMain {

    // 如果不加volatile程序永远不会停止
//    boolean running = true;
    volatile boolean running = true;

    void m(){
        System.out.println("m start");
        while(running){


        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        VolatileMain volatileMain = new VolatileMain();
        new Thread(volatileMain::m, "t1").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        volatileMain.running = false;
    }
}
