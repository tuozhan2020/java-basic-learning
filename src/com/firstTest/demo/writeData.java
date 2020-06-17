package com.firstTest.demo;
import java.io.PrintWriter;

public class writeData {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");
        if ( file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = null;
        try {
            output = new PrintWriter( file);
            output.println("John T Smith");
            output.println(90);
            output.println("Eric K Jones ");
            output.println(85);
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            output.close();
        }

        output.close();
    }
}
