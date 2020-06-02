package com.firstTest.demo;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate,e.g.,7.25%");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print( "Enter number of years as an integer ,e.g.,S:" );
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount,e.g.,120000.95:");
        double loadAmount = input.nextDouble();
        double monthlyPayment = loadAmount * monthlyInterestRate / ( 1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $"+ (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
    }

    public static class computeTime {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("输入秒数:");
            int seconds = input.nextInt();
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            System.out.println("此时间可转换成为:" + minutes + "分" + remainingSeconds + "秒");
        }
    }

    public static class randTest {
        public static void main(String[] args) {
            int number1 = (int)(Math.random() * 10 );
            int number2 = (int)(Math.random() * 10 );

            if ( number1 < number2){
                int temp = number1 ;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " -" + number2 + " ?");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if ( number1 - number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
            }
        }
    }
}
