package com.lbj.a5.synch;

/**
 * @Classname SynDemo
 * @Description TODO
 * @Date 2020/6/29 20:15
 * @Created by libaojie
 */
public class SynDemo implements Runnable {

    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"  m1 start!");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+"  m1 end!");
    }


    public void m2(){
        System.out.println(Thread.currentThread().getName()+" m2 start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m2 end");
    }

    public static void main(String[] args) {
        SynDemo synDemo = new SynDemo();
        new Thread(synDemo, "t1").start();
    }

    public void run() {

    }
}
