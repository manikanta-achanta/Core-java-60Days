package com.manikanta.exception;

public class TrickQ1 {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Handled");
        }

    }
}