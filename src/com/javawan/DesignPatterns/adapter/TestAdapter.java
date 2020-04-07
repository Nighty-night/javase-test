package com.javawan.DesignPatterns.adapter;

/**
 * @description： 测试
 * @author： wangkang
 * @date： 2020/1/9 16:15
 */
public class TestAdapter {
    public static void main(String[] args) {
        DualPin dualPinDevice = new TV();//多态，运行时才知道是哪个实例
        Adapter adapter = new Adapter(dualPinDevice);
        adapter.electrify(1,2,3);

        ClassAdapter classAdapter = new ClassAdapter();//专门供TV实例使用
        classAdapter.electrify(4,5,6);
    }
}
