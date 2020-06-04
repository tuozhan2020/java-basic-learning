package com.firstTest.demo;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个10进制数字:");
        int decimal = input.nextInt();

        String hex = "";
        while ( decimal != 0){
            int hexValue = decimal % 16;
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char ) (hexValue + '0') : (char) ( hexValue - 10 + 'A');
            hex += hexDigit;
            decimal /= 16;
        }
        System.out.println("转换成的16进制数:" + hex);
    }
}
