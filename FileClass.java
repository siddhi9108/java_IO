package javaapplication2;


import java.io.*;
import java.util.Date;

public class FileClass {

    public static void main(String[] args) {
        File f1 = new File("D:\\test\\Demo.txt");

        System.out.println(f1.length());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.canExecute());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.lastModified());
        Date d= new Date(f1.lastModified());
        System.out.println(d);

    }
}
