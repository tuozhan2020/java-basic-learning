package com.firstTest.demo;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");

        try {
            Scanner input = new Scanner(file);
            while( input.hasNext()){
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                    System.out.println(firstName + " " + mi + lastName + " " + score);
            }
            input.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally{

        }
    }
}
