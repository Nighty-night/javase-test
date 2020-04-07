package com.javawan.alibaba.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @description： 使用工具类 Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方 法，它的 add/remove/clear 方法会抛出 UnsupportedOperationException 异常。
 * Arrays.asList 返回的是个不可修改的list.本质上还是定长的数组，和Collections.toArray对应，起到连接数组和集合的作用。
 * @author： wangkang
 * @date： 2019/10/31 15:35
 */
public class OneFiveEight {
    public static void main(String[] args) {
//        说明：asList 的返回对象是一个 Arrays 内部类，并没有实现集合的修改方法。Arrays.asList 体现的是适
//        配器模式，只是转换接口，后台的数据仍是数组。
        String[] str = new String[] { "yang", "hao" };
        List list = Arrays.asList(str);
        str[0] = "changed";
        System.out.println(list.get(0));//结果：changed
//        第一种情况：list.add("yangguanbao"); 运行时异常。
//        第二种情况：str[0] = "changed"; 也会随之修改，反之亦然。
    }
}
