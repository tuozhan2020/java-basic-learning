package com.firstTest.demo;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字n:");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        System.out.print("请输入数字:");
        for ( int i = 0 ; i < n ; i ++)
        {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        int count = 0 ;
        for ( int i = 0 ; i < n ; i ++)
            if ( numbers[i] > average)
                count ++;

        System.out.println("平均值是:" + average);
        System.out.println("平均值以上的数字个数为:" + count);
    }
}
