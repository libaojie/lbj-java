package com.lbj.a1.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        // 匿名类
//        new Thread(new Runnable() {
//            public void run() {
//                System.out.print("普通线程！");
//            }
//        }).start();

        // 使用lambda创建线程
//        new Thread(()-> System.out.println("lambda")).start();
        System.out.print("Hello World");
    }
}
