package com.manikanta.datatypes;

public class TypeCastingDemo {

    public static void main(String[] args) {

        int num = 10;

        // Implicit casting
        double value = num;

        System.out.println("Implicit Casting: " + value);

        double price = 19.99;

        // Explicit casting
        int p = (int) price;

        System.out.println("Explicit Casting: " + p);
    }
}