package com.lbj.thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname CreateThread
 * @Description 创建线程
 * @Date 2020/6/24 21:10
 * @Created by libaojie
 */
public class CreateThread {
    public static void main(String[] args) {

//        CreateThread.threadDemo();
//        CreateThread.runnableDemo();
        CreateThread.callableDemo();
    }


    private static void threadDemo() {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

    }

    private static void runnableDemo(){
        new Thread(new RunnableDemo()).start();
    }

    private static void callableDemo() {
        CallableDamo callableDamo = new CallableDamo();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableDamo);

        new Thread(futureTask).start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}


class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 开始运行线程：" + Thread.currentThread().getName());
        System.out.println(this.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 结束线程：" + Thread.currentThread().getName());

    }
}

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println("Runnable 开始运行线程：" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable 结束线程：" + Thread.currentThread().getName());
    }
}

class CallableDamo implements Callable<Integer> {

    public Integer call() throws Exception {
        return 1;
    }
}
