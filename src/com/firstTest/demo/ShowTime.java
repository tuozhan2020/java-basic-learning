package com.firstTest.demo;

public class ShowTime {
    public static void main(String[] args) {
        long nowTime = System.currentTimeMillis();
        long totalSeconds = nowTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinues = totalSeconds / 60;
        long currentMinute = totalMinues % 60;
        long totalHours = totalMinues / 60;
        long currentHour = totalHours % 24;
        System.out.println("当前时间为:" + currentHour + ":" + currentMinute + ":"+ currentSecond + " GMT");
    }
}
