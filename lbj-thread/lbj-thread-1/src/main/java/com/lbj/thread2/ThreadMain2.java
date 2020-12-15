package com.lbj.thread2;

public class ThreadMain2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread2(0);
        thread1.start();

        Thread thread2 = new Thread2(1);
        thread2.start();


    }
}


