package com.manikanta.memory;

public class MemoryExample {

    int x = 10;

    public static void main(String[] args) {

        int a = 5; // stack

        MemoryExample obj = new MemoryExample(); // heap

        obj.display();

    }

    void display() {
        int b = 20; // stack
        System.out.println(b);
    }
}