package com.lbj.thread1;

public class ThreadMain1 {

    public static void main(String[] args) {

        Thread thread1 = new Thread1(0);
        thread1.start();

        Thread thread2 = new Thread1(1);
        thread2.start();


    }
}


