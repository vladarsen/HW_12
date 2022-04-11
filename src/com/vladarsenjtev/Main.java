package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> strings = new ArrayList<>();
        strings.add(7);
        strings.add(9);
        strings.add(9);
        strings.add(9);
        strings.add(2);
        strings.add(9);
        strings.add(5);

        System.out.println(strings);
        System.out.println(findUnique(strings));

    }
    public static Set<Integer> findUnique(ArrayList<Integer> arrayList) {
        Set<Integer> uniqueInteger = new HashSet<Integer>(arrayList);
        return uniqueInteger;
    }
}
