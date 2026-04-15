package com.manikanta.collections.HashSet;


import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // 🔹 1. Create HashSet
        HashSet<String> set = new HashSet<>();

        // 🔹 2. Add elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate
        System.out.println("After add(): " + set);

        // 🔹 3. Add null
        set.add(null);
        set.add(null); // duplicate null
        System.out.println("After adding null: " + set);

        // 🔹 4. Check size
        System.out.println("Size: " + set.size());

        // 🔹 5. Check contains
        System.out.println("Contains Java? " + set.contains("Java"));
        System.out.println("Contains Go? " + set.contains("Go"));

        // 🔹 6. Remove element
        set.remove("C++");
        System.out.println("After remove(): " + set);

        // 🔹 7. Iterate using for-each
        System.out.println("Iterating elements:");
        for (String s : set) {
            System.out.println(s);
        }

        // 🔹 8. Check if empty
        System.out.println("Is empty? " + set.isEmpty());

        // 🔹 9. Clear set
        set.clear();
        System.out.println("After clear(): " + set);

        // 🔹 10. Check again empty
        System.out.println("Is empty after clear? " + set.isEmpty());
    }
}
