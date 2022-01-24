package com.javasolutions.codewars.codewars;

import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\([0-9]{3}\\)\\s[0-9]{3}\\-[0-9]{4}", phoneNumber);
    }
}
