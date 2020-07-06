package javaapplication2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOUsingBuffer {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader fin = new FileReader("D:\\NewFolder\\file2.txt");
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter("D\\NewFolder\\file4.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        String s1 = "";
        while ((s1 = bin.readLine()) != null) {
            System.out.println(s1);
            fout.write(s1);
        }        
        
        fin.close();
        fout.close();
        System.out.println("File Copied!!!");
        
    }
    
}
