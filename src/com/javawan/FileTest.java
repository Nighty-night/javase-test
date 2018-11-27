package com.javawan;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws Exception{
        File file = new File("test-file.txt");
//        第一次未执行createNewFile()返回：false,执行一次后返回：true
        System.out.println("文件是否存在："+file.exists());
        file.createNewFile();
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件的名字："+file.getName());
//        绝对路径：从盘符开始，是完整的路径
        System.out.println("文件的绝对路径："+file.getAbsolutePath());
//        相对路径：当前路径，相对于某一位置
        System.out.println("文件的相对路径："+file.getPath());
        System.out.println("文件的父路径："+file.getParent());
        System.out.println("文件是否可写："+file.canRead());
        System.out.println("文件是否可读："+file.canWrite());
        System.out.println("文件的长度："+file.length());
        System.out.println("文件的最近更改时间："+file.lastModified());
        System.out.println("文件是否是一个目录："+file.isDirectory());
        System.out.println("文件是否存在："+file.isFile());
        System.out.println("文件是否隐藏："+file.isHidden());
        FileTest.testFile1();
        FileTest.testFile2();
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
    }

    public static void testFile1(){
//        windows下使用\分割，但linux下不是
        File f1 = new File("F:\\hello.txt");
//ctrl+alt+t try-catch快捷键
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        想删除文件，可用
//        if(f1.exists()){
//            f1.delete();
//        }else{
//            System.out.println("文件不存在");
//        }
    }

    public static void testFile2(){
        String filename = "F:" + File.separator + "world.txt";
        File f2 = new File(filename);
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(f2.exists()){
            f2.delete();
        }else{
            System.out.println("文件不存在");
        }
    }
}
