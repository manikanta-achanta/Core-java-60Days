package com.manikanta.collections.list;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);


        System.out.println(list);
        System.out.println(list.get(2));
    }
}