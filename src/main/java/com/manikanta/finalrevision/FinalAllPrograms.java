package com.manikanta.finalrevision;

import java.util.*;

public class FinalAllPrograms {

    public static void main(String[] args) throws Exception {

        // 🔥 1. Reverse String
        String s = "Java";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reverse String: " + reversed);

        // 🔥 2. Remove Duplicates from Array
        int[] arr = {1, 2, 2, 3, 4, 4};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Remove Duplicates: " + set);

        // 🔥 3. Frequency Count of Characters
        String str = "java";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Frequency Count: " + freqMap);

        // 🔥 4. Second Largest Element
        int[] nums = {10, 20, 30, 40, 50};
        Arrays.sort(nums);
        int secondLargest = nums[nums.length - 2];
        System.out.println("Second Largest: " + secondLargest);

        // 🔥 5. Palindrome Check
        String word = "madam";
        String rev = new StringBuilder(word).reverse().toString();
        if (word.equals(rev)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // 🔥 6. Fibonacci Series
        int n = 6;
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();

        // 🔥 7. Factorial
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        // 🔥 8. Multithreading Counter (Thread-safe)
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Thread Safe Counter: " + counter.count);

        // 🔥 9. HashMap Iteration
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println("HashMap Iteration:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔥 10. ArrayList Operations
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.remove("Java");

        System.out.println("ArrayList: " + list);
    }
}

// 🔥 Thread-safe Counter Class
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}