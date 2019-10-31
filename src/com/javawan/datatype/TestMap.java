package com.javawan.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description：
 * @author： wangkang
 * @date： 2019/7/19 9:24
 */
public class TestMap{
   Map<String,String> map1 = new HashMap<>();//线程不安全，效率高
   Map<String,String> map2 = new Hashtable<>();//线程安全，效率低 synchronized 一个锁，不能操作其他
   Map<String,String> map3 = new ConcurrentHashMap<>();//线程安全，效率高 多个锁，能同时操作其他

   /**
    * subList 返回的是 ArrayList 的内部类 SubList，并不是 ArrayList 而是 ArrayList 的一个视图，对
    * 于 SubList 子列表的所有操作最终会反映到原列表上。
    * @param args
    */
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>(4);
      list.add("aaa");
      list.add("bbb");
      list.add("ccc");
      List<String> strings = list.subList(0, 2);
      strings.add("ddd");
      strings.remove("aaa");
      System.out.println(list.size());
      list.stream().forEach(System.out::println);
   }

}
