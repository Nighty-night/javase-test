package com.javawan.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description： volatile是否能保证原子性
 * volatile 内存可见性
 *  保证原子性：1、synchronized  2、Lock
 * @author： wangkang
 * @date： 2020/1/7 14:27
 */
public class TestVolatile {
    public volatile int inc = 0;
    Lock lock = new ReentrantLock();

    public void increase() {
        lock.lock();
        try{
            inc++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final TestVolatile test = new TestVolatile();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                }
            }.start();
        }

        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}
