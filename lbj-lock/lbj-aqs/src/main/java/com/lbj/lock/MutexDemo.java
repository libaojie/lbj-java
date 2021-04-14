package com.lbj.lock;


import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

/**
 * @Description TODO
 * @Date 2021/4/13 19:52
 * @File MutexDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class MutexDemo {

    public static void main(String[] args) {
        Mutex mutex = new Mutex();
        try {
            mutex.acquire();
            try {
                // do something
            } finally {
                mutex.release();
            }
        } catch(InterruptedException ie) {
            // ...
        }
    }
}
