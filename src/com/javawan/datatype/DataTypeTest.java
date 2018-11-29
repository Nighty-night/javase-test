package com.javawan.datatype;

import java.nio.file.LinkOption;
import java.util.ArrayList;

/**
 * 八种基本类型：
 *  数据类型：byte，short，int,long,float,double
 *  字符类型：char
 *  布尔类型：boolean(1位)
 * 应用类型：class，interface,数组
 */
public class DataTypeTest {
    public static void main(String[] args){
        int a1 = 10;   //默认：十进制
        System.out.println(a1);
        int a2 = 010;  //八进制
        System.out.println(a2);
        int a3 = 0x10; //十六进制
        int a4 = 0xa;
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(Integer.toBinaryString(a1));  //转二进制
        System.out.println(Integer.toOctalString(a1));   //转八进制
        System.out.println(Integer.toHexString(a1));     //转十六进制

        //long b1 = 12345678987654321; 编译不通过，超出int取值范围 -2^31～2^31-1
        long b2 = 12345678987654321L;
        System.out.println(b2);
        //byte b3 = 200; 超过byte/char/short的取值范围，会编译报错
        byte b4 = 100; //未超过取值范围，则自动转型
        System.out.println(b4);

        char c1 = 'a';
        int i = c1 + 2;
        System.out.println(i);
        char c2 = (char)i; //强制转型
        System.out.println(c2);

        //打印a-z
        ArrayList list = new ArrayList();
        for(int j=0; j<26; j++){
            char c3 = (char)(c1+j);
            list.add(c3);
        }
        System.out.println(list.toString());
    }
}
