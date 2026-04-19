package com.manikanta.collections.IteratorANDListIterator;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();

        // Forward
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Backward
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
