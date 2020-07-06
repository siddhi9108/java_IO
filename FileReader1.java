package javaapplication2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReader1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fin = new FileReader("D:\\NewFolder\\file2.txt");

        int x;
        do {
            x = fin.read();
            if (x != -1) {
                System.out.println((char) x);
            }

        } while (x != -1);

        fin.close();

    }

}
