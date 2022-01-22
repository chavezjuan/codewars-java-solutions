package com.javasolutions.codewars.codewars;

public class NumbersDivisors {

    public static long numberOfDivisors(int n) {
        var qtdDivisors = 0;

        for (var i = 1; i <= n; i++) {
            if (n % i == 0)
                qtdDivisors++;
        }

        return qtdDivisors;
    }
}
