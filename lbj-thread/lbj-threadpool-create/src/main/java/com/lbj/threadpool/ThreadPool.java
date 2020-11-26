package com.lbj.threadpool;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 实现线程池
 */
public class ThreadPool {

    // 线程数量
    private int coreSize;

    // 是否停止
    private boolean stop = false;

    // 线程队列
    private LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>();

    private Thread[] threads;

    public ThreadPool(int coreSize) {
        this.coreSize = coreSize;
        threads = new Thread[coreSize];
        for (int i = 0; i < coreSize; i++) {
            threads[i] = new Thread(new Worker("thread" + i));
            threads[i].start();
        }
    }

    public boolean submit(Runnable command) {
        return tasks.add(command);
    }

    public void shutdown() {
        this.stop = true;
    }

    private class Worker implements Runnable {

        public String name;

        public Worker(String name) {
            this.name = name;
        }

        public void run() {

            while (!stop) {
                try {
                    Runnable command = tasks.take();
                    System.out.println(name + " Start run,  starttime" + System.currentTimeMillis() / 1000);
                    command.run();
                    System.out.println(name + " finished,  finishtime" + System.currentTimeMillis() / 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
