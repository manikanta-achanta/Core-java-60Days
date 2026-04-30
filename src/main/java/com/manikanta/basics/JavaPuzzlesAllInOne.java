package com.manikanta.basics;

import java.util.HashSet;

public class JavaPuzzlesAllInOne {

    public static void main(String[] args) {

        //  Puzzle 1 — String Immutability
        String s = "Java";
        s.concat(" Rocks");
        System.out.println("Puzzle 1: " + s);

        //  Puzzle 2 — == vs equals()
        String a = "Java";
        String b = new String("Java");
        System.out.println("Puzzle 2 (==): " + (a == b));
        System.out.println("Puzzle 2 (equals): " + a.equals(b));

        //  Puzzle 3 — Method Overloading
        TestOverload obj = new TestOverload();
        obj.show(10);

        //  Puzzle 4 — Static behavior
        TestStatic t1 = new TestStatic();
        TestStatic t2 = new TestStatic();
        t1.x = 20;
        System.out.println("Puzzle 4: " + t2.x);

        //  Puzzle 5 — Exception flow
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Puzzle 5: Catch");
        } finally {
            System.out.println("Puzzle 5: Finally");
        }

        //  Puzzle 6 — finally overrides return
        System.out.println("Puzzle 6: " + testFinally());

        //  Puzzle 7 — HashSet duplicate
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        System.out.println("Puzzle 7: " + set.size());

        //  Puzzle 8 — Thread run vs start
        Thread t = new Thread(() -> {
            System.out.println("Puzzle 8: Thread");
        });
        t.run();
        System.out.println("Puzzle 8: Main");

        //  Puzzle 9 — Increment trap
        int i = 5;
        System.out.println("Puzzle 9: " + (i++ + ++i));

        //  Puzzle 10 — Null pointer
        String str = null;
        System.out.println("Puzzle 10 (==): " + (str == null));
        try {
            System.out.println(str.equals("Java"));
        } catch (Exception e) {
            System.out.println("Puzzle 10: NullPointerException");
        }
    }

    //  Puzzle 6 helper
    static int testFinally() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}

//  Puzzle 3 class
class TestOverload {
    void show(int a) {
        System.out.println("Puzzle 3: int");
    }

    void show(double a) {
        System.out.println("Puzzle 3: double");
    }
}

//  Puzzle 4 class
class TestStatic {
    static int x = 10;
}