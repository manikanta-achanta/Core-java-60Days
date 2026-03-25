package com.manikanta.oops.constructor;

class Scholar {

    Scholar() {
        this(10);
        System.out.println("Default");
    }

    Scholar(int x) {
        System.out.println("Parameterized: " + x);
    }
}

public class TrickC3 {

    public static void main(String[] args) {

        Scholar s1 = new Scholar();

    }
}
