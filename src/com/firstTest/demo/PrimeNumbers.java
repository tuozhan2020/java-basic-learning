package com.firstTest.demo;

import javax.sound.midi.SysexMessage;
public class PrimeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 5;
        int count = 0 ;
        int num = 2;
        System.out.println("The first 30 prime numbers are:");
        while ( count < NUMBER_OF_PRIMES)
        {
            boolean isPrime = true;
            for ( int divisor = 2 ; divisor <= num / 2 ; divisor ++)
            {
                if ( num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
            {
                count ++;
                System.out.print(num + " " );
            }
            num ++;
        }
    }
}
