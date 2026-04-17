package com.manikanta.collections.TreeSet;



import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //  1. Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        //  2. Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate
        System.out.println("After add(): " + set);

        //  3. Size
        System.out.println("Size: " + set.size());

        //  4. Contains
        System.out.println("Contains 20? " + set.contains(20));

        //  5. First & Last
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        //  6. Higher & Lower
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));

        //  7. Remove element
        set.remove(10);
        System.out.println("After remove(10): " + set);

        //  8. Iterate
        System.out.println("Iterating:");
        for (Integer num : set) {
            System.out.println(num);
        }

        //  9. Poll (remove first & last)
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After polling: " + set);

        //  10. Check empty
        System.out.println("Is empty? " + set.isEmpty());

        //  11. Clear
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
