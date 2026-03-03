package com.manikanta.jvm;

public class StackHeapDemo {

    public static void main(String[] args) {

        // Primitive variable → stored in STACK
        int x = 5;

        // Reference variable 's1' → stored in STACK
        // Actual Student object → stored in HEAP
        Student s1 = new Student();

        // Assigning values to object (stored in HEAP)
        s1.name = "Manikanta";
        s1.age = 21;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}