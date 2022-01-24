package com.javasolutions.codewars.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrafficLightsOneCar {
    final static int GREEN = 5;
    final static int ORANGE = 1;
    final static int RED = 5;

    int timeGreen = 0;
    int timeRed = 0;


    public static String[] trafficLights(String road, int n) {
        List<String> traffic = new ArrayList<>();
        traffic.add(road);
        var next = 1;

        var actualRoad = road.split("");

        for (var i = 0; i < n; i++) {
            if (!actualRoad[next].equals("R")) {
                traffic.set(next, "C");
                next++;
            } else {
                var time = 0;
                while (time < RED) {
                    time++;
                    i++;
                }
            }
        }

        return new String[] {""};
    }




    void checkState (String ligths) {
        var greenPosition = ligths.indexOf("G");
        var redPosition = ligths.indexOf("R");
    }
}

