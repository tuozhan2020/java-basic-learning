package com.firstTest.demo;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入第一个数字:");
        int n1 = input.nextInt();
        System.out.print("输入第二个数字:");
        int n2 = input.nextInt();

        System.out.println("上述两数的最大公约数是:" + gcd(n1,n2));
    }

    public static int gcd(int n1,int n2)
    {
        int gcd = 1;
        int k = 2 ;

        while ( k <= n1 && k <= n2)
        {
            if ( n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k ++;
        }
        return  gcd;
    }
}
