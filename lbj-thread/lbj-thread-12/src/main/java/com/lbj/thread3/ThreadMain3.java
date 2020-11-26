package com.lbj.thread3;

public class ThreadMain3 {

    public static void main(String[] args) {

        Thread thread1 = new Thread3(0);
        thread1.start();

        Thread thread2 = new Thread3(1);
        thread2.start();


    }
}


