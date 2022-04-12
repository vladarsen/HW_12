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

        System.out.println(findOccurance(strings));
    }

    public static List<NameTypeList>  findOccurance(ArrayList<String> arrayList) {
        List<NameTypeList> result = new ArrayList<>();
        Set<String> uniqueWords  = new HashSet<>(arrayList);

        for (String word : uniqueWords) {
            result.add(new NameTypeList(word, Collections.frequency(arrayList, word)));
        } return result;
    }
}