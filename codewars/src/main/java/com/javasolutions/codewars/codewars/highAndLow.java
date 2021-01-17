package com.javasolutions.codewars.codewars;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;


public class highAndLow {
    public static String highAndLowFinder(String numbers) {
        var arrNumbers = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max, min;
        min = max = arrNumbers[0];

        for (Integer strTemp : arrNumbers) {
            if (strTemp > max) {
                max = strTemp;
            } else if (strTemp < min) {
                min = strTemp;
            }
        }

        return String.valueOf(max) + " " + String.valueOf(min);
    }
}
