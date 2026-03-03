package com.manikanta.day1;

public class HelloWorld {

    public static void main(String[] args) {

        // "Hello Java" string object is created in HEAP
        // Reference to that object is managed internally
        System.out.println("Hello Java");

        // Primitive variable stored in STACK memory
        int number = 10;

        System.out.println(number);
    }
}