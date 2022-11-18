package org.exam.exercise4.services;

public class ArrayServices {


    public String namesLength(String[] names) {
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length())
                longestName = name;
        }

        String shortestName = longestName;
        for (String name : names) {
            if (name.length() < shortestName.length())
                shortestName = name;
        }

        return ("Longest name is " + longestName + " and shortest name is " + shortestName);
    }


    public int femaleNames(String[] names) {
        int counter = 0;
        for (String name : names) {
            if (name.equalsIgnoreCase("Kuba") || !name.endsWith("a")) {
            } else
                counter++;
        }
        return counter;
    }

    public double getPercent(String[] names) {
        int counter = 0;
        for (String name : names) {
            if (name.equalsIgnoreCase("Kuba") || !name.endsWith("a")) {
            } else
                counter++;
        }
        return ((double) counter / names.length) * 100;
    }

}




