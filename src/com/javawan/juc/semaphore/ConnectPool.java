package com.javawan.juc.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @description： 使用Semaphore手写一个连接池
 * @author： wangkang
 * @date： 2019/12/30 16:28
 */
public class ConnectPool {

    //连接池大小
    private int size;
    //数据库连接集合
    private Connect[] connects;
    //连接状态标志
    private boolean[] connectFlag;
    //剩余可用连接数
    private volatile int available;
    //信号量
    private Semaphore semaphore;

    //构造器
    public ConnectPool(int size) {
        this.size = size;
        this.available = size;
        semaphore = new Semaphore(size, true);
        connects = new Connect[size];
        connectFlag = new boolean[size];
        initConnects();
    }

    //初始化连接
    private void initConnects() {
        //生成指定数量的数据库连接
        for(int i = 0; i < this.size; i++) {
            connects[i] = new Connect();
        }
    }

    //获取数据库连接
    private synchronized Connect getConnect(){
        for(int i = 0; i < connectFlag.length; i++) {
            //遍历集合找到未使用的连接
            if(!connectFlag[i]) {
                //将连接设置为使用中
                connectFlag[i] = true;
                //可用连接数减1
                available--;
                System.out.println("【"+Thread.currentThread().getName()+"】以获取连接      剩余连接数：" + available);
                //返回连接引用
                return connects[i];
            }
        }
        return null;
    }

    //获取一个连接
    public Connect openConnect() throws InterruptedException {
        //获取许可证
        semaphore.acquire();
        //获取数据库连接
        return getConnect();
    }

    //释放一个连接
    public synchronized void release(Connect connect) {
        for(int i = 0; i < this.size; i++) {
            if(connect == connects[i]){
                //将连接设置为未使用
                connectFlag[i] = false;
                //可用连接数加1
                available++;
                System.out.println("【"+Thread.currentThread().getName()+"】以释放连接      剩余连接数：" + available);
                //释放许可证
                semaphore.release();
            }
        }
    }

    //剩余可用连接数
    public int available() {
        return available;
    }
}
