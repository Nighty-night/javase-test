package com.javawan.DesignPatterns;

/**
 * @description： 单例模式
 * @author： wangkang
 * @date： 2019/7/20 16:16
 */
public class Singleton {

//    //1、饿汉模式
      //确保对象实例只有一个。
//    private static Singleton singleton = new Singleton();
//    //构造器私有化
//    private Singleton(){
//    }
      //以静态方法返回实例
//    public static Singleton getSingleton(){
//        return singleton;
//    }
    //缺点：造成资源浪费的问题

    //2、懒汉模式
//    private static Singleton singleton = null;
//    //构造器私有化
//    private Singleton(){
//    }
//    //获取对象的时候再进行实例化
//    public static Singleton getSingleton(){
//        if(singleton == null){//先验证对象是否创建
//            synchronized(Singleton.class){//加锁的方式会严重影响性能,只有当对象未创建的时候才上锁
//                if(singleton == null){
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
    /**
     *  DCL是完美的解决了单例模式中性能和资源浪费的问题，但是DCL在并发情下也会存在一个问题，因为Jvm指令是乱序的；
     * 情况如下：
     * 线程1调用getInstance 获取对象实例，因为对象还是空未进行初始化，此时线程1会执行new Singleton()进行对象实例化，而当线程1的进行new Singleton()的时候JVM会生成三个指令。
     * 指令1:分配对象内存。
     * 指令2:调用构造器，初始化对象属性。
     * 指令3:构建对象引用指向内存。
     *
     * 因为编译器会自作聪明的对指令进行优化， 指令优化后顺序会变成这样:
     * 1、执行指令1：分配对象内存，
     * 2、执行指令3：构建对象引用指向内存。
     * 3、然后正好这个时候CPU 切到了线程2工作，而线程2此时也调用getInstance获取对象，那么线程2将执行下面这个代码 if (singleton == null)，此时线程2发现对象不为空（因为线程1已经创建对象引用并分配对象内存了），那么线程2会得到一个没有初始化属性的对象（因为线程1还没有执行指令2）。
     * 所以在这种情况下，双检测锁定的方式会出现DCL失效的问题。
     */

    //3、用内部类实现懒汉模式
    private Singleton(){
    }

    public static Singleton getInstance(){
        return SingletonHoler.singleton;
    }
    //定义静态内部类
    private static class SingletonHoler{
        //当内部类第一次访问时，创建对象实例
        private static Singleton singleton = new Singleton();
    }
    /**
     * 静态内部类原理：
     * 当外部内被访问时，并不会加载内部类，所以只要不访问SingletonHoler 这个内部类，
     * private static Singleton singleton = new Singleton() 不会实例化，这就相当于实现懒加载的效果，
     * 只有当SingletonHoler.singleton 被调用时访问内部类的属性，此时才会将对象进行实例化，
     * 这样既解决了恶汉模式下可能造成资源浪费的问题，也避免了了懒汉模式下的并发问题。
     */
}
