package com.javawan.DesignPatterns.strategy;

/**
 * @description： 减法策略
 * @author： wangkang
 * @date： 2020/1/9 17:11
 */
public class Subtraction implements Strategy{//实现算法接口

    @Override
    public int calculate(int a, int b) {//减数与被减数
        return a - b;//这里我们做减法运算
    }

}
