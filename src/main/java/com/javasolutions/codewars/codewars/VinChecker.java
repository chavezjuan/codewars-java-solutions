package com.javasolutions.codewars.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VinChecker {

    public static boolean checkVin(String vin) {

        Pattern vinPattern = Pattern.compile("^[a-hj-npr-z,A-HJ-NPR-Z,0-9]*$");
        Matcher m = vinPattern.matcher(vin);

        if (vin.length() == 17 && m.find()) {

            String[] arrVin = vin.split("");

            var summed = weightMultiplierAndSum(convertToNumber(vin));

            return isValid(arrVin, Integer.toString(summed % 11));
        } else {

            return false;
        }
    }

    static String[] convertToNumber(String vin) {
        Pattern letterPattern = Pattern.compile("[A-Z,a-z]");

        String[] arr = vin.split("");

        for (int i = 0; i < arr.length; i++) {
            Matcher l = letterPattern.matcher(arr[i]);

            if (l.find()) {
                arr[i] = dictionary(arr[i]);
            }
        }

        return arr;
    }

    static int weightMultiplierAndSum(String[] arr) {
        var acc = 0;
        int[] weight = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};

        int[] decoded = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        for (var i = 0; i < 17; i++) {
            acc += decoded[i] * weight[i];
        }

        return acc;
    }

    static boolean isValid(String[] vin, String modulus) {

        return vin[8].equals(modulus) || (vin[8].equals("X") && modulus.equals("10"));
    }

    static String dictionary(String letter) {
        HashMap<String, String> set = new HashMap<>();
        set.put("A", "1");
        set.put("B", "2");
        set.put("C", "3");
        set.put("D", "4");
        set.put("E", "5");
        set.put("F", "6");
        set.put("G", "7");
        set.put("H", "8");
        set.put("J", "1");
        set.put("K", "2");
        set.put("L", "3");
        set.put("M", "4");
        set.put("N", "5");
        set.put("P", "7");
        set.put("R", "9");
        set.put("S", "2");
        set.put("T", "3");
        set.put("U", "4");
        set.put("V", "5");
        set.put("W", "6");
        set.put("X", "7");
        set.put("Y", "8");
        set.put("Z", "9");



        return set.getOrDefault(letter, "0");
    }
}
