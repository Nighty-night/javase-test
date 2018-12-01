package com.javawan.datatype;

public class TestOperator {
    public static void main(String[] args) {
        //二元运算
        double d = 10.1 % 3; //浮点型也能取余
        System.out.println(d);

        //一元运算
        int a = 3;
        int b = a++; //先赋值，再自加。b=3,a=4
        System.out.println(b);
        System.out.println(a);
        int c = ++a; //先自加，再赋值。a=5,c=5
        System.out.println(a);
        System.out.println(c);

        //逻辑运算符，测试逻辑短路
        boolean f = 1>2 && 3>(4/0);
        System.out.println(f); // 1>2返回false,则不会报除数不能为0的错

        /*
            int 4个字节32位，首位符号位正数为0
            其余31位 1：true，0：false
            在计算机中数值用补码表示 -9在计算机中的表示是：1_000_0000_0000_0000_0000_0000_0000_0111 除符号位均取反，末尾加1后的值1_111_1111_1111_1111_1111_1111_1111_0111
         */
        int m = 8; //0_000_0000_0000_0000_0000_0000_0000_1000
        int n = 4; //0_000_0000_0000_0000_0000_0000_0000_0100
        System.out.println(m & n); //0_000_0000_0000_0000_0000_0000_0000_0000
        System.out.println(m | n); //0_000_0000_0000_0000_0000_0000_0000_1100
        System.out.println(~ m);   //1_111_1111_1111_1111_1111_1111_1111_0111(-9的补码)
        System.out.println(m ^ n); //0_000_0000_0000_0000_0000_0000_0000_1100

        int h = 3*2*2;
        int i = 3<<2; //3*2^2,左移2位等于乘以2两次
        int j = 16/2/2/2;
        int k = 16>>3; //12/2^3，右移3位等于除以2三次
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
