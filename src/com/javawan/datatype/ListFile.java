package com.javawan.datatype;

import java.io.File;

/**
 * 使用list列出指定目录下的全部文件（包括隐藏文件）
 * 如果想列出完整路径的，需要使用listFiles，返回File的数组。
 * 注：ctr+c选择一行
 */
public class ListFile {
    public static void main(String[] args){
        String filename = "F:" + File.separator;
        File f = new File(filename);
        //返回true
        System.out.println(f.isHidden());
        //list()列出全部文件
        String[] str1 = f.list();
        for(String s : str1){
            System.out.println(s);
        }
        //listFiles()列出完整路径
        File[] str2 = f.listFiles();
        for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
    }
}
