package com.javasolutions.codewars.codewars;

public class NumberPrime {
    public static Boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        } else {
            int[] primeDividers = {2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29, 31};

            for (int primeDivider : primeDividers) {
                if (num >= primeDivider) {
                    if (num % primeDivider == 0 && !((num / primeDivider) < primeDivider) && num != primeDivider)
                        return false;
                }
            }

            return true;
        }
    }
}


