package com.javasolutions.codewars.codewars;

import java.util.Arrays;

public class WellOfIdeas {
    public static String well(String[] x) {
        var goodCount = Arrays.stream(x).filter(e -> e.equalsIgnoreCase("good")).count();

        var result = goodCount > 2 ? "I smell a series!" : goodCount > 0 ? "Publish!" : "Fail!";

        return result;
    }
}