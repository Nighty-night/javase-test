package com.javawan.DesignPatterns.adapter;

/**
 * @description： 使用两插标准的电视机
 * @author： wangkang
 * @date： 2020/1/9 16:07
 */
public class TV implements DualPin  {

    @Override//既然是两项插头，当然实现两项插标准
    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + n);
    }
}
