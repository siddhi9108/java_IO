package javaapplication2;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriter1 {

    public static void main(String[] args) throws IOException {

        String msg = "This is char io";
        char[] arr = msg.toCharArray();
        CharArrayWriter fout = new CharArrayWriter();
        fout.write(arr);
        FileWriter f1 = new FileWriter("D\\NewFolder\\test5.txt");
        fout.writeTo(f1);
        f1.close();

    }

}
