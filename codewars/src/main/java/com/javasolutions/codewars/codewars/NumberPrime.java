package com.javasolutions.codewars.codewars;

public class NumberPrime {
    public static Boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        } else {

            int divider = 2;

            while (divider * divider <= num) {
                if (num % divider == 0) {
                    return false;
                } else {
                    divider++;
                }
            }

            return true;
        }
    }
}


