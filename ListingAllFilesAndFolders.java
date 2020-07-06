package javaapplication2;

import java.io.*;
import java.util.Date;

public class ListingAllFilesAndFolders {

    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\test");

        String[] arr = f1.list();
        for (String name : arr) {
            System.out.println(name);
        }

    }
}
