package com.javasolutions.codewars.codewars;

import java.util.Arrays;

public class exesAndOhs {
    public static boolean getXO (String str) {
        var arrLetters = Arrays.stream(str.split("")).toArray(String[]::new);
        var countX = 0;
        var countO = 0;

        for (String tempString : arrLetters) {
            if (tempString.equalsIgnoreCase("x")) {
                countX++;
            } else if (tempString.equalsIgnoreCase("o")) {
                countO++;
            }
        }

        return countO == countX;
    }

        /*for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i)== )
        }*/


}

