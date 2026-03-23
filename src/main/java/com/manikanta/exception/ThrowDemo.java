package com.manikanta.exception;

public class ThrowDemo {

    public static void main(String[] args) {

        int age = 16;

        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        }

    }
}
