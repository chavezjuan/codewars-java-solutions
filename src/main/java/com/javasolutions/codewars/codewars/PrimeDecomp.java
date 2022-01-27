package com.javasolutions.codewars.codewars;

import java.util.ArrayList;
import java.util.List;

/*
* Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java
* Solution author: Juan Chavez
* */
public class PrimeDecomp {

    public static String factors(int n) {

        List<Integer> primeNumbers = new ArrayList<>();

        var maxPrime = Math.sqrt(n);

        var divisor = 2;

        int dividend = n;

        while (divisor * divisor <= n) {
            if (dividend % divisor == 0) {
                primeNumbers.add(divisor);
                dividend = n / divisor;
            } else {
                divisor++;
            }
        }
        return primeNumbers.toString();

        // TODO: Programa dando erro de out of memory. Corrigir algoritmo.
    }
}
