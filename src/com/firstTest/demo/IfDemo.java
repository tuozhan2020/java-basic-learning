package com.firstTest.demo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        if ( number % 5 == 0 )
            System.out.println("HiFive");
        if ( number % 2 == 0 )
            System.out.println("HiEven");
    }
}
