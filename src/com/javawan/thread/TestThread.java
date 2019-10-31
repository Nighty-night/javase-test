package com.javawan.thread;

/**
 * @description：
 * @author： wangkang
 * @date： 2019/7/19 19:02
 */
public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        Thread thread1 = new Thread(new MyRunnable(),"现在");
        Thread thread2 = new Thread(new MyRunnable(),"过去");
        Thread thread3 = new Thread(new MyRunnable(),"将来");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
