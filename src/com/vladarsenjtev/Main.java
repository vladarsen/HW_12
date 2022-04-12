package com.vladarsenjtev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("mazda");
        strings.add("from");
        strings.add("port");
        strings.add("play");
        strings.add("java");
        strings.add("change");
        strings.add("from");
        strings.add("change");
        strings.add("change");
        strings.add("mazda");

        calcOccurance(strings);
    }

    public static void calcOccurance(ArrayList<String> arrayList) {
        Set<String> uniqueWords  = new HashSet<>(arrayList);

        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(arrayList, word));
        }
    }
}

