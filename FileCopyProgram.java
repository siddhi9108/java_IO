package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyProgram {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream f1 = new FileInputStream("D:\\New folder\\test.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\New folder\\test1.txt");
        int x;
        x = f1.read();
        if (x != -1) {
            f2.write(x);

        }
        while (x != -1);
        f1.close();
        f2.close();

    }

}
