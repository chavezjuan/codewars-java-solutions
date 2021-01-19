package com.javasolutions.codewars.codewars;

import java.util.Arrays;

public class reversedString {
    public static String reverseString(String str) {
        var onlyLetters = Arrays.stream(str.split("")).toArray(String[]::new);
        String reversedWord = "";
        for (var i = onlyLetters.length - 1; i >= 0; i--) {
            reversedWord += onlyLetters[i];
        }
        return reversedWord;
    }
}
