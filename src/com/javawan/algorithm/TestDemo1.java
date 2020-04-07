package com.javawan.algorithm;
import	java.util.HashMap;
import java.util.Map;

public class TestDemo1 {
    public static void main(String[] args) {
        TestDemo1 testDemo = new TestDemo1();
        Map<Integer, Integer> test = testDemo.test();
        for(Map.Entry<Integer, Integer> entry : test.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public Map<Integer,Integer> test(){
        Map<Integer,Integer> map = new HashMap<> ();
        for(int n=1;n<=100;n++){
            Integer sum1 = 0;
            Integer sum2 = 0;
            for(int i=n-1;i>0;i--){
                sum1 = sum1 + i;
            }
            for(int j=n+1;j<=100;j++){
                sum2 = sum2 + j;
                if(sum1<sum2){//小于就不用加了，因为永远不等
                    break;
                }
                if(sum2==sum1){
                    map.put(n,j);
                }
            }
        }
        return map;
    }
}
