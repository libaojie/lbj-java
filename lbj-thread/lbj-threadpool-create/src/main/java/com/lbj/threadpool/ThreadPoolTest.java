package com.lbj.threadpool;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(5);

        for(int i =0; i < 30; i++){
            threadPool.submit(new Task());
        }

        System.out.println("add finished");

    }


    private static class Task implements Runnable{

        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
