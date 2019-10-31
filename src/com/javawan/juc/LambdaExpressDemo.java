package com.javawan.juc;

@FunctionalInterface
interface Foo{
    void sayHello();
}
/**
 * @description： lambda 拷贝小括号，写死右箭头，落地大括号
 * @author： wangkang
 * @date： 2019/10/21 15:42
 */
public class LambdaExpressDemo {
    public static void main(String[] args) {
        Foo foo = () -> {
            System.out.println("你好！吃了吗？");
        };
        foo.sayHello();
    }
}
