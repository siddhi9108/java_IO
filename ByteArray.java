package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArray {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String msg = "This is demo java.io";
        byte[] arr = msg.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        int x;
        do {
            x = bin.read();
            if (x != -1) {
                System.out.println((char) x);
            }
        } while (x != -1);
    }

}
