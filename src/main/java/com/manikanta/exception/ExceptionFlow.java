package com.manikanta.exception;

public class ExceptionFlow {

    public static void main(String[] args) {

        try {
            System.out.println("Start");

            int a = 10 / 0;

            System.out.println("End");

        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block");
        }

    }
}