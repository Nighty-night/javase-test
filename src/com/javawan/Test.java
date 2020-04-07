package com.javawan;

/**
 * @description：
 * @author： wangkang
 * @date： 2019/11/25 16:44
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int age = 10;
        for(int i=2;i<9;i++){//加七次
            age = test.add2(age);
            if(i==8){//第八个人
                System.out.println(age);
            }
        }
    }

    private int add2(int result){
        return result + 2;
    }
}
