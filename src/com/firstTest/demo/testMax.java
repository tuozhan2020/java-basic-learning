package com.firstTest.demo;

import javax.sound.midi.SysexMessage;

public class testMax {
    public static void main(String[] args) {
        int i = 5 ,j = 2 ,k = max(i,j);
        System.out.println("最大值是:"+ k);
    }

    public static int max(int num1,int num2)
    {
        int result;
        if ( num1 > num2 )
            result = num1;
        else
            result = num2;
        return result;
    }
}
