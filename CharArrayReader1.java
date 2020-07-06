package javaapplication2;


import java.io.CharArrayReader;
import java.io.IOException;


public class CharArrayReader1 {

    public static void main(String[] args) throws IOException  {

        String msg = "This is char io";
        char[] arr = msg.toCharArray();
        CharArrayReader f1 = new CharArrayReader(arr);
        int x;
        do {
            x = f1.read();
            if (x != -1) {
                System.out.println((char) x);
            }

        } while (x != -1);

    }

}
