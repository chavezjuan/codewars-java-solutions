package com.javasolutions.codewars.codewars;


public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";

        // Another solution:
        /*if (number % 2 == 0) {
            System.out.println("Even");
            return "Even";
        } else {
            System.out.println("Odd");
            return "Odd";
        }*/
    }


}
