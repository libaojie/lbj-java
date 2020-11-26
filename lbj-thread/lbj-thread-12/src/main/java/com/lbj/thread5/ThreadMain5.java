package com.lbj.thread5;

public class ThreadMain5 {

    public static void main(String[] args) {

        Thread thread1 = new Thread5(0);
        thread1.start();

        Thread thread2 = new Thread5(1);
        thread2.start();

        Thread thread3 = new Thread5(2);
        thread3.start();


    }
}


