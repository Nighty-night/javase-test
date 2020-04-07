package com.javawan.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TestDemo2 {
    public static void main(String[] args) {
        TestDemo2 testDemo = new TestDemo2();
        Map<Integer, Integer> test = testDemo.test();
        for(Map.Entry<Integer, Integer> entry : test.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public Map<Integer,Integer> test(){//Map<K,V>泛型，KV只能放包装类型，因为存在为null的情况
        Map<Integer,Integer> map = new HashMap<> ();
        for(int n=1;n<=1000;n++){
            for (int i = n+1; i < 1000; i++) {
                if(2*n*n-i*i-i==0){
                    map.put(n,i);
                }
            }
        }
        return map;
    }
}
