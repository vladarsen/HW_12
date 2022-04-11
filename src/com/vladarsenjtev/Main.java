package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println(toList(arr));
    }

    public static ArrayList<Integer> toList(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j : arr) {
            Collections.addAll(arrayList, j);
        }
        return arrayList;
     }
}
