package com.javawan.filestream;

import java.io.File;

/**
 * Ctrl+/单行注释
 * Ctrl+Shift+/多行注释
 * 使用isDirectory判断一个指定的路径是否为目录
 */
public class DirectoryTest {
    /**输入psv快速创建main方法*/
    public static void main(String[] args) {
        String filename = "F:" + File.separator;
        File f = new File(filename);
        if(f.isDirectory()){
//         sout以下语句的快捷键
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        //结果：YES

        print(f);
    }

    public static void print(File f){
        if(f != null){
            if(f.isDirectory()){
                File[] fileArray = f.listFiles();
                if(fileArray != null){
                    for(File fa : fileArray){
                        //递归通用，调用自身
                        print(fa);
                    }
                }
            }else{
                System.out.println(f);
            }
        }
    }
}
