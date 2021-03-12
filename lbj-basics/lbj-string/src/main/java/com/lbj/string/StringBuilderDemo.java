package com.lbj.string;

public class StringBuilderDemo {
    public static void main(String[] args) {

//        StringBuilderDemo.sample();
        StringBuilderDemo.thread();

    }

    /**
     * 简单输出
     */
    private static void sample(){
        StringBuilder stringBuilder = new StringBuilder("init");
        System.out.println(stringBuilder);
        stringBuilder.append("one");
        System.out.println(stringBuilder);

    }

    /**
     * 线程
     */
    private static void thread(){

        final StringBuilder stringBuilder = new StringBuilder("init");

        new Thread(new Runnable() {
            public void run() {
                while (true) {

                    stringBuilder.append("-1");
                    System.out.println(stringBuilder);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            public void run() {
                while (true) {

                    stringBuilder.append("-2");
                    System.out.println(stringBuilder);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

}
