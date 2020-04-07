package com.javawan.algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 程序员小明住在一个从1开始编门牌号的街道上，每天他都从家开始往左或
 * 往右遛猫，直到走到街道的尽头然后回家。经过几天，他发现无论往左还是
 * 往右，路过的牌号之和相等。请列举1000以内所有这样的街道和小明的门牌
 * 号的整数对。
 * 小明住6号，最大门牌是8 1+2+3+4+5=7+8
 */
public class TestDemo2 {
    public static void main(String[] args) {
        TestDemo2 testDemo = new TestDemo2();
        Map<Integer, Integer> test = testDemo.test();
        for(Map.Entry<Integer, Integer> entry : test.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public Map<Integer,Integer> test(){//Map<K,V>泛型，KV只能放包装类型，因为存在为null的情况
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int n=1;n<=1000;n++){
            for (int i = n+1; i < 1000; i++) {
                if(2*n*n-i*i-i==0){//n-小明家门牌号，i为最大的门牌号
                    map.put(n,i);
                }
            }
        }
        return map;
    }
}
