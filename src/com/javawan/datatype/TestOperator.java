package com.javawan.datatype;

public class TestOperator {
    public static void main(String[] args) {
        //浮点型也能取余
        double d = 10.1 % 3;
        System.out.println(d);

        int a = 3;
        int b = a++; //先赋值，再自加。b=3,a=4
        System.out.println(b);
        System.out.println(a);
        int c = ++a; //先自加，再赋值。a=5,c=5
        System.out.println(a);
        System.out.println(c);
    }
}
