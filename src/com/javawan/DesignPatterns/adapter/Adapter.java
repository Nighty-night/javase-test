package com.javawan.DesignPatterns.adapter;

/**
 * @description： 对象适配器，三插标准适配两插标准
 * @author： wangkang
 * @date： 2020/1/9 16:09
 */
public class Adapter implements TriplePin {

    private DualPin dualPinDevice;

    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    @Override
    public void electrify(int l, int n, int e) {
        //实际上调用了被适配设备的双插通电，地线e被丢弃了。
        dualPinDevice.electrify(l, n);
    }
}
