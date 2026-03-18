package com.manikanta.jvm;

public class MemoryDemo {

    int x = 10; // stored in heap

    public static void main(String[] args) {

        int a = 5; // stack

        MemoryDemo obj = new MemoryDemo(); // heap

        obj.display();

    }

    void display() {
        int b = 20; // stack
        System.out.println(b);
    }
}