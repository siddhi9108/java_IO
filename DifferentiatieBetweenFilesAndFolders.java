package javaapplication2;

import java.io.*;
import java.util.Date;

public class DifferentiateBetweenFilesAndFolders {

    public static void main(String[] args) {

        File f1 = new File("D:\\test");
        File[] arr = f1.listFiles();

        if (f1.isFile()) {
            System.out.println("File" + f1.getName());
        } else {
            System.out.println("Dir" + f1.getName());
        }

    }

}
