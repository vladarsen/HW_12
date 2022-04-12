package com.vladarsenjtev;

public class NameTypeList {
    private final String name;
    private final int count;

    @Override
    public String toString() {
        return "NameTypeList{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public NameTypeList(String name, int count) {
        this.name = name;
        this.count = count;

    }
}