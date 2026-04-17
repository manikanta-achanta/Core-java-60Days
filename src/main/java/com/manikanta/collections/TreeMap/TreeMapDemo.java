package com.manikanta.collections.TreeMap;



import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        //  1. Create TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        //  2. Put elements
        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");
        map.put(2, "Updated C++"); // overwrite
        System.out.println("After put(): " + map);

        //  3. Size
        System.out.println("Size: " + map.size());

        //  4. Get value
        System.out.println("Value for key 1: " + map.get(1));

        //  5. Contains
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        //  6. First & Last key
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        //  7. Higher & Lower keys
        System.out.println("Higher than 2: " + map.higherKey(2));
        System.out.println("Lower than 2: " + map.lowerKey(2));

        //  8. Remove
        map.remove(3);
        System.out.println("After remove(3): " + map);

        //  9. Iterate (BEST WAY)
        System.out.println("Iterating:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //  10. Check empty
        System.out.println("Is empty? " + map.isEmpty());

        //  11. Clear
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
