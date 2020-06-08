package com.firstTest.demo;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("圆的半径是："+ circle1.radius + "，其面积是:"+circle1.getArea());
    }
}

class SimpleCircle{
    double radius;
    SimpleCircle(){
        radius = 1;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }

}