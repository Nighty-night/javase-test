package com.javawan.alibaba.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @description： 【强制】使用集合转数组的方法，必须使用集合的 toArray(T[] array)，传入的是类型完全一 致、长度为 0 的空数组。
 * @author： wangkang
 * @date： 2019/10/31 15:25
 */
public class OneFiveSix {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        String[] array = list.toArray(new String[0]);
        /**
         * 说明：使用 toArray 带参方法，数组空间大小的 length：
         * 1） 等于 0，动态创建与 size 相同的数组，性能最好。
         * 2） 大于 0 但小于 size，重新创建大小等于 size 的数组，增加 GC 负担。
         * 3） 等于 size，在高并发情况下，数组创建完成之后，size 正在变大的情况下，负面影响与上相同。
         * 4） 大于 size，空间浪费，且在 size 处插入 null 值，存在 NPE 隐患。
         */
    }
}
