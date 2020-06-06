package com.firstTest.demo;

import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        double[][] nums = new double[3][4];
        Scanner input = new Scanner(System.in);
        int i,j,sum;
        for ( i = 0 ; i < 3 ; i ++)
        {
            sum = 0;
            for ( j = 0 ; j < 4 ; j ++)
            {
                nums[i][j] = input.nextInt();
                sum += nums[i][j];
            }
            System.out.println("sum:" + sum + "\n");
        }
    }
}
