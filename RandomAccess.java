package javaapplication2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        RandomAccessFile f = new RandomAccessFile("D:\\New folder\\test.4", "rws");
        f.seek(4);
        int x;
        do {
            x = f.read();
            System.out.println((char) x);
        } while (x != -1);
        System.out.println("Second time read....");
        do {
            x = f.read();
            System.out.println((char) x);
        } while (x != -1);
        f.close();

    }

}
