package com.javawan.alibaba.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description：
 * 【强制】使用 Map 的方法 keySet()/values()/entrySet()返回集合对象时，不可以对其进行添
 * 加元素操作，否则会抛出 UnsupportedOperationException 异常。
 * @author： wangkang
 * @date： 2019/10/31 14:22
 */
public class OneFiveThree {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("aaa","AAA");
        map.put("bbb","BBB");
        map.put("ccc ","CCC");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry : entries){
            map.put("ddd", "DDD");
            break;
        }
    }
}
