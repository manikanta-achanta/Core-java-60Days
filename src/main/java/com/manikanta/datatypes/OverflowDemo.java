package com.manikanta.datatypes;

public class OverflowDemo {

    public static void main(String[] args) {

        byte num = 127;

        num++;

        System.out.println("Overflow result: " + num);
    }
}