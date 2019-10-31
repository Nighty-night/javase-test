package com.javawan.thread;

/**
 * @description： 测试线程
 * 1、通过继承Thread类实现一个线程
 * 2、通过实现Runnable接口实现一个线程
 *    继承扩展性不强，java总只支持单继承，如果一个类继承Thread就不能继承其他的类了。
 * @author： wangkang
 * @date： 2019/7/19 19:00
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("未来");
        System.out.println(Thread.currentThread().getName()+"加油");
    }
}
