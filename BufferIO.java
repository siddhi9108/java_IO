package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream f1 = new FileInputStream("D:\\New folder\\test.txt");
        BufferedInputStream bin = new BufferedInputStream(f1);
        FileOutputStream f2 = new FileOutputStream("D:\\New folder\\test1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(f2);
        int x;
        do {
            x = bin.read();
            if (x != -1) {
                bout.write(x);
            }

        } while (x != -1);
        bin.close();
        bout.close();

    }

}
