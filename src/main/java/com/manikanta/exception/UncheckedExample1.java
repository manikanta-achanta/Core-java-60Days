package com.manikanta.exception;

public class UncheckedExample1 {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled error");
        }

        System.out.println("Program continues");

    }
}