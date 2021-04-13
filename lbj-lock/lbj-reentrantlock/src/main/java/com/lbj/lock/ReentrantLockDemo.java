package com.lbj.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description ReentrantLock可重入性体现
 * @Date 2021/4/13 14:39
 * @File ReentrantLockDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class ReentrantLockDemo {
    private final Lock lock = new ReentrantLock();

    public int get(int value) {
        try {
            lock.lock();
            return value;
        } catch (Exception e) {
            return 0;
        } finally {
            lock.unlock();
        }
    }

    public int add(int value) {
        try {
            lock.lock();
            return value+get(value);
        } catch (Exception e) {
            return 0;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        System.out.println(reentrantLockDemo.add(100));
    }
}
