package com.firstTest.demo;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        double pi;

        radius = 20;
        pi = 3.1415926;

        area = radius * radius * pi;
        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}
