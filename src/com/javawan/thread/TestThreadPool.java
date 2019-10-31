package com.javawan.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @description： 线程池
 * Java通过Executors提供四个静态方法创建四种线程池，分别为：
 *      newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 *      newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 *      newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 *      newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
 *线程池的作用？
 * 1、限定线程的个数，不会导致由于线程过多导致系统运行缓慢或崩溃
 * 2、线程池不需要每次都去创建或销毁，节约了资源、
 * 3、线程池不需要每次都去创建，响应时间更快。
 * 连接池也是一样
 * @author： wangkang
 * @date： 2019/7/20 15:38
 */
public class TestThreadPool {
    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(5);
        Executors.newScheduledThreadPool(10);
        Executors.newSingleThreadExecutor();
    }
}
