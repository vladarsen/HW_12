package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Яблоко");
        strings.add("Ананас");
        strings.add("Банан");
        strings.add("Яблоко");
        strings.add("Яблоко");
        strings.add("Апельсин");
        strings.add("Персик");
        strings.add("Арбуз");
        strings.add("Арбуз");
        strings.add("Виноград");

        System.out.println(countOcurrance(strings, "Яблоко"));

        }

    public static int countOcurrance(ArrayList<String> list, String str){
        int count = 0;
        for (String s : list) {
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
