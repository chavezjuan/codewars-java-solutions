package com.javasolutions.codewars.codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        var letters = new ArrayList<String>(Arrays.asList(str.split("")));
        var commentNeutralized = "";

//        letters.stream().map(e -> "aeiou".contains(e.toLowerCase()) ? letters.remove(e) : null);

        for (var i = 0; i < letters.size(); i++) {
            while ( i < letters.size() && "aeiou".contains(letters.get(i).toLowerCase()))
                letters.remove(i);
        }

        for (var i : letters)
            commentNeutralized += i;

        return commentNeutralized;
    }
}
