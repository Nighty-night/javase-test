package com.javawan.alibaba.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description： 不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用 Iterator 方式，如果并发操作，需要对 Iterator 对象加锁。
 * @author： wangkang
 * @date： 2019/10/31 17:15
 */
public class OneFiveEleven {
    public static void main(String[] args) {
//        正例：
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if ("2".equals(item)) {
//                iterator.remove();
//            }
//        }
//        反例：
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        /**
         * Exception in thread "main" java.util.ConcurrentModificationException
         * 	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
         * 	at java.util.ArrayList$Itr.next(ArrayList.java:859)
         * 	at com.javawan.alibaba.collection.OneFiveEleven.main(OneFiveEleven.java:26)
         */
    }
}
