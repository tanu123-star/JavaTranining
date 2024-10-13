package com.qascript;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadFiles {
    public static void main(String[] args) {

        try{
        FileInputStream file = new FileInputStream("D:/demoo.txt");
        int c = file.read();
            System.out.println((char) c);
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
       }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
