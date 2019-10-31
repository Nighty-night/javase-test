package com.javawan.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @description： 序列化实现深拷贝
 * @author： wangkang
 * @date： 2019/10/31 11:00
 */
public class CloneUtils {
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj) {
        T cloneObj = null;
        try {
            //写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();
            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);
            //返回生成的新对象
            cloneObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneObj;
    }



    public static void main(String[] args) throws Exception{
        CloneUtils outter = new CloneUtils();

        Teacher t = new Teacher();
        t.setName("Teacher Wang");
        t.setAge(50);

        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("ZhangSan");
        s1.setTeacher(t);

        Student s2 = clone(s1);
        System.out.println("拷贝得到的信息:");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getTeacher().getName());
        System.out.println(s2.getTeacher().getAge());
        System.out.println("---------------------------");

        // 将复制后的对象的老师信息修改一下：
        s2.getTeacher().setName("New Teacher Wang");
        s2.getTeacher().setAge(28);

        System.out.println("修改了拷贝对象的教师后：");
        System.out.println("拷贝对象的教师：");
        System.out.println(s2.getTeacher().getName());
        System.out.println(s2.getTeacher().getAge());
        System.out.println("原来对象的教师：");
        System.out.println(s1.getTeacher().getName());
        System.out.println(s1.getTeacher().getAge());

        // 由此证明序列化的方式实现了对象的深拷贝
    }
}

class Teacher implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student implements Serializable {
    private String name;
    private int age;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
