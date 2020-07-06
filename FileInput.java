package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fin = new FileInputStream("D:\\NewFolder\\data.");
        DataInputStream din = new DataInputStream(fin);
        int a = din.readInt();
        double b = din.readDouble();
        boolean c = din.readBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        din.close();

    }

}
