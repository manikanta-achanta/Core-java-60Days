package com.manikanta.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //  1. Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        //  2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        //  3. Add at first and last
        list.addFirst(5);
        list.addLast(40);
        System.out.println("After addFirst & addLast: " + list);

        //  4. Add at specific index
        list.add(2, 15);
        System.out.println("After add at index 2: " + list);

        //  5. Get elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        //  6. Remove elements
        list.remove(); // removes first element
        System.out.println("After remove(): " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        list.remove(1); // remove by index
        System.out.println("After remove index 1: " + list);

        list.remove(Integer.valueOf(20)); // remove by value
        System.out.println("After remove value 20: " + list);

        //  7. Check size
        System.out.println("Size: " + list.size());

        //  8. Check if contains
        System.out.println("Contains 30? " + list.contains(30));

        //  9. Iterate using loop
        System.out.println("Using for-each loop:");
        for (Integer num : list) {
            System.out.println(num);
        }

        //  10. Clear list
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
