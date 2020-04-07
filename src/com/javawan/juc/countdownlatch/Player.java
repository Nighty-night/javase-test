package com.javawan.juc.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @description：应用场景：在玩欢乐斗地主时必须等待三个玩家都到齐才可以进行发牌。
 * @author： wangkang
 * @date： 2019/12/31 16:21
 */
public class Player extends Thread {

    private static int count = 1;
    private final int id = count++;
    private CountDownLatch latch;

    public Player(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("【玩家" + id + "】已入场");
        latch.countDown();//每执行一次都会减1，直到为0,则唤醒阻塞线程
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        System.out.println("牌局开始, 等待玩家入场...");
        new Player(latch).start();
        new Player(latch).start();
        new Player(latch).start();
        latch.await();//阻塞3条线程，等待被唤醒
        System.out.println("玩家已到齐, 开始发牌...");
    }

}
