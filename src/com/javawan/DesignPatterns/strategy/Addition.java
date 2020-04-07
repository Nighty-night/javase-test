package com.javawan.DesignPatterns.strategy;

/**
 * @description： 加法策略
 * @author： wangkang
 * @date： 2020/1/9 17:10
 */
public class Addition implements Strategy{//实现算法接口

    @Override
    public int calculate(int a, int b) {//加数与被加数
        return a + b;//这里我们做加法运算
    }

}
