package com.javawan.DesignPatterns.adapter;

/**
 * @description： 类适配器
 * @author： wangkang
 * @date： 2020/1/9 16:12
 */
public class ClassAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
