package com.manikanta.collections.HashMap;



import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //  1. Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //  2. Put (add key-value pairs)
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(1, "Spring"); // duplicate key (value replaced)

        System.out.println("After put(): " + map);

        //  3. Get value
        System.out.println("Get key 1: " + map.get(1));

        //  4. Check contains
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Java'? " + map.containsValue("Java"));

        //  5. Remove element
        map.remove(3);
        System.out.println("After remove key 3: " + map);

        //  6. Size of map
        System.out.println("Size: " + map.size());

        //  7. Add null key and values
        map.put(null, "NullKey");
        map.put(4, null);
        System.out.println("After adding nulls: " + map);

        //  8. Iterate using keySet()
        System.out.println("Iterating using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        //  9. Iterate using entrySet() (BEST)
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //  10. Check if empty
        System.out.println("Is empty? " + map.isEmpty());

        //  11. Replace value
        map.replace(2, "Django");
        System.out.println("After replace: " + map);

        //  12. Clear map
        map.clear();
        System.out.println("After clear(): " + map);

        //  13. Check again empty
        System.out.println("Is empty after clear? " + map.isEmpty());
    }
}
