package com.firstTest.demo;

import java.util.Scanner;

public class ComputeCircle {
    public static void main(String[] args) {
        final double PI = 3.1415926;

        Scanner input = new Scanner(System.in);
        System.out.print("输入一个数字的半径:");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.println("圆的半径是:"  + radius + "，它的面积是:" + area);

    }
}
