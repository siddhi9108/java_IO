package javaapplication2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderCopyFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fin = new FileReader("D:\\NewFolder\\file2.txt");
        FileWriter fout = new FileWriter("D\\NewFolder\\file4.txt");
        int x;
        do {
            x = fin.read();
            if (x != -1) {
                fout.write(x);
            }

        } while (x != -1);

        fin.close();
        fout.close();
        System.out.println("File Copied!!!");

    }

}
