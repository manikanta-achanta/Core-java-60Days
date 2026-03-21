package com.manikanta.exception;

public class UncheckedExample2 {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("i will run every time");
        }

    }
}