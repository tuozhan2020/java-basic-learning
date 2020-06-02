package com.firstTest.demo;
import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个城市:");
        String city1 = input.nextLine();
        System.out.print("请输入第二个城市:");
        String city2 = input.nextLine();

        if ( city1.compareTo(city2) < 0 )
            System.out.println("城市排名:" + city1 + " " + city2);
        else
            System.out.println("城市排名:" + city2 + " " + city1);
    }
}
