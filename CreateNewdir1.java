package javaapplication2;

import java.io.*;
import java.util.Date;

public class CreateNewdir1 {

    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\test\\Demo.txt");

        if (f1.exists()) {
            System.out.println("dir Exists");
        } else {
            f1.mkdir();
            System.out.println("dir Created");
        }

    }
}
