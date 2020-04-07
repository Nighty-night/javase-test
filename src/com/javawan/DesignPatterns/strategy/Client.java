package com.javawan.DesignPatterns.strategy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description： 测试
 * @author： wangkang
 * @date： 2020/1/9 17:20
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//实例化计算器
        calculator.setStrategy(new Addition());//接入加法实现
        int result = calculator.getResult(1, 1);//计算！
        System.out.println(result);//得到的是加法结果2

        calculator.setStrategy(new Subtraction());//再次接入减法实现
        result = calculator.getResult(1, 1);//计算！
        System.out.println(result);//得到的是减法结果0

    }
}
