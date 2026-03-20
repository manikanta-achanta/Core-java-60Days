package com.manikanta.memory;

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null; // eligible

        obj2 = new GarbageCollectionDemo(); // old object eligible

        System.gc();

    }

}