package com.firstTest.demo;

public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("两个数字中较大的为:"  + max(3 , 4));
        System.out.println("两个数字中较大的为:"  + max(3.0 , 5.3));
        System.out.println("两个数字中较大的为:"  + max(1.3 , 8.5, 2.9 ));
    }

    public static int max(int num1 , int num2)
    {
        return ( num1 > num2 ? num1 : num2 );
    }

    public static double max(double num1 , double num2)
    {
        return ( num1 > num2 ? num1 : num2 );
    }

    public static double max(double num1 , double num2,double num3)
    {
        return ( max( max(num1, num2) ,num3 ) );
    }


}
