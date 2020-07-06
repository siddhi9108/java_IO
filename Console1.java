package javaapplication2;

import java.io.Console;

import java.io.IOException;

public class Console1 {

    public static void main(String[] args) throws IOException {

        String uname = "";
        String pass = "";
        Console con = System.console();
        System.out.println("Enter Username");
        uname = con.readLine();
        System.out.println("Enter Password");
        char[] arr = con.readPassword();
        pass = new String(arr);
        System.out.println("your username is" + uname);
        System.out.println("your password is" + pass);
    }

}
