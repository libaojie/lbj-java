package com.lbj.thread;

/**
 * @Description TODO
 * @Date 2021/4/9 8:44
 * @File Wait
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class WaitDemo {
    private static Object obj = new Object();

    public static void main(String[] args) {
        new Thread(new WaitThread()).start();
        new Thread(new NotifyThread()).start();
    }

    static class WaitThread implements Runnable {
        @Override
        public void run() {
            synchronized (obj) {
                System.out.println("start wait!");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end wait!");
            }
        }
    }

    static class NotifyThread implements Runnable {
        @Override
        public void run() {
            synchronized (obj) {
                System.out.println("start notify!");
                obj.notify();
                System.out.println("end notify");
            }
        }
    }
}

/**
 * 使用wait，notify来实现等待唤醒功能至少有两个缺点：
 *
 * 1.由上面的例子可知,wait和notify都是Object中的方法,在调用这两个方法前必须先获得锁对象，这限制了其使用场合:只能在同步代码块中。
 * 2.另一个缺点可能上面的例子不太明显，当对象的等待队列中有多个线程时，notify只能随机选择一个线程唤醒，无法唤醒指定的线程。
 * 而使用LockSupport的话，我们可以在任何场合使线程阻塞，同时也可以指定要唤醒的线程，相当的方便。
 */
