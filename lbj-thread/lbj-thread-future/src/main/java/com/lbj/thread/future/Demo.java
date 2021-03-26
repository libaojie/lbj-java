package com.lbj.thread.future;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Description 最简单的函数回调
 * @Date 2021/3/26 16:51
 * @File Demo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Demo {
    public static void main(String[] args) {

        // 第一种
        type1();
        // 第二种
        type2();

    }

    private static void type1() {
        // 第一种
        FutureTask<Integer> result = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt();
            }
        });
        new Thread(result).start();
        try {
            System.out.println("result:" + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    private static void type2() {
        // 第二种
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> result = executor.submit(new Callable<Integer>() {
                                                     @Override
                                                     public Integer call() throws Exception {
                                                         return new Random().nextInt();
                                                     }
                                                 }
        );
        // shutdown调用后，不可以再submit新的task，已经submit的将继续执行。
        executor.shutdown();

        try {
            System.out.println("result:" + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
