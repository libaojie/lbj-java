package com.lbj.thread;

/**
 * @Description TODO
 * @Date 2021/4/9 9:29
 * @File JoinDemo1
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class JoinDemo1 {

    public static void main(String[] args) {
        Child child = new Child();
        child.start();
        try {
            // 加上后并行改串行，等child执行完
            child.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main");
    }

}
class Child extends Thread{

    public void run(){
        System.out.println("child start");
        try {
            sleep(2000);
            System.out.println("child end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

