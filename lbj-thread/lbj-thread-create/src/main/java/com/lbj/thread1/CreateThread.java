package com.lbj.thread1;

import java.util.concurrent.*;

/**
 * @Classname CreateThread
 * @Description 创建线程
 * @Date 2020/6/24 21:10
 * @Created by libaojie
 */
public class CreateThread {
    public static void main(String[] args) {

        // 启动线程共五种方式

//        CreateThread.threadDemo();
//        CreateThread.runnableDemo();
        CreateThread.callableDemo();
    }


    /**
     * 第一种：通过继承Thread 直接创建
     */
    private static void threadDemo() {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

    }

    /**
     * 第二种：通过实现Runnable 再包装Thread实现
     */
    private static void runnableDemo() {
        new Thread(new RunnableDemo()).start();
    }

    /**
     * 第三种：通过实现Callable 再包装Thread可实现有返回值的线程
     */
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

    /**
     * 第四种：匿名函数方式
     */
    private static void anonymityDemo() {
        new Thread(() -> {
            System.out.println("创建线程");
        }).start();
    }

    /**
     * 第五种：线程池方式
     */
    private static void threadPoolDemo(){
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{
            System.out.println("创建线程");
        });
        service.shutdown();
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
