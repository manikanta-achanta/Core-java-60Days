package com.manikanta.basics.final_usage;

public class FinalVariableExample {
    public static void main(String[] args) {
        final int x = 10;  // x is declared final
        System.out.println("Initial value of x: " + x);

        // Trying to reassign will cause a compile-time error
        // x = 20; // ❌ error: cannot assign a value to final variable x
    }
}

