package com.manikanta.jvm;

// Test.java
import java.lang.reflect.*;

public class ReflectionApi {
    public static void main(String[] args) throws Exception {
        // Load the Student class dynamically
        Class<?> c = Class.forName("Student");

        System.out.println("Class Name: " + c.getName());

        // List all declared methods
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }
    }
}

