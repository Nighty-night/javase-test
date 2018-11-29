package com.javawan.datatype;

/**
 * jdk7特性，下划线分割符,方便程序员识别，不会影响数值
 */
public class TestBinaryTest {
    public static void main(String[] args) {
        int a = 0b0000_0000_0000_0000_0000_0000_0000_0011;
        int b = 1_2345_6789;
        System.out.println(a);
        System.out.println(b);
    }
}
