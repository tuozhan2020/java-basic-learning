package com.firstTest.demo;

import java.util.Scanner;

public class MultInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = ( number1 + number2 + number3);
        System.out.println("这三个数的平均值是:" + average);
    }
}
