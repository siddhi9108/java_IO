package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String msg = "This is demo java.io";
        byte[] arr = msg.getBytes();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(arr);
        FileOutputStream fout = new FileOutputStream("D:\\New folder\\test.txt");
        bout.writeTo(fout);
        fout.close();

    }

}
