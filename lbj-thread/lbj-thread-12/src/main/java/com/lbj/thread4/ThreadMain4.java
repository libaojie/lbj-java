package com.lbj.thread4;

public class ThreadMain4 {

    public static void main(String[] args) {

        Thread thread1 = new Thread4(0);
        thread1.start();

        Thread thread2 = new Thread4(1);
        thread2.start();


    }
}


