package javaapplication2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fout = new FileOutputStream("D:\\NewFolder\\data.");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(100);
        dout.writeDouble(2.3);
        dout.writeBoolean(true);
        dout.close();
                System.out.println("File Saved");
                

    }

}
