package com.javawan.alibaba.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @description： 【强制】Collections 类返回的对象，如：emptyList()/singletonList()等都是 immutable  list，不可对其进行添加或者删除元素的操作。
 * @author： wangkang
 * @date： 2019/10/31 15:12
 */
public class OneFiveFour {
    public static void main(String[] args) {
        List<String> list = Collections.emptyList();
        list.add("immutable");
        /*
        Exception in thread "main" java.lang.UnsupportedOperationException
        at java.util.AbstractList.add(AbstractList.java:148)
        at java.util.AbstractList.add(AbstractList.java:108)
        at com.javawan.alibaba.collection.OneFiveFour.main(OneFiveFour.java:15)
         */
        List<String> stringList = Collections.singletonList("immutable");
        stringList.add("list");
    }
}
