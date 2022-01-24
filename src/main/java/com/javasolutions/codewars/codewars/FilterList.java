package com.javasolutions.codewars.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterList {
    public static List filterList(final List<Object> list) {

        List<Object> listCopy = new ArrayList<>(list);

        if (listCopy.isEmpty()) {
            return listCopy;
        } else {
            for (var i = 0; i < listCopy.size(); i++) {
                if (listCopy.get(i).getClass() == String.class) {
                    listCopy.remove(i);
                    i--;
                } else if (listCopy.get(i).getClass() == Integer.class &&
                        Integer.parseInt(listCopy.get(i).toString()) >= 0) {
                    continue;
                } else {
                    return null;
                }
            }

            return listCopy;
        }

        // /* Another way to solve the problem using stream but not validate other types */
        // return list.stream()
        // .filter(e -> e instanceof Integer && Integer.parseInt(e.toString()) >= 0)
        // .collect(Collectors.toList());
    }
}
