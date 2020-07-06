package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ResetKeyword {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream f1 = new FileInputStream("D:\\New folder\\test.txt");
        BufferedInputStream bin = new BufferedInputStream(f1);
        FileOutputStream f2 = new FileOutputStream("D:\\New folder\\test1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(f2);
        int x;
        byte[] arr = new byte[1024];
        bin.skip(10);
        x = bin.read();
        System.out.println((char) x);
        x = bin.read();
        System.out.println((char) x);
        bin.reset();

        x = bin.read();
        System.out.println((char) x);

        //do {
        //   x = bin.read(arr);
        // System.out.println("Value of x"+x);
        //if (x != -1) {
        //  bout.write(arr);
        //}
        //} while (x != -1);
        //bout.flush();
        //bin.close();
        //bout.close();
        //SySystem.out.println("File Copied");
    }

}
