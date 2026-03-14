package com.manikanta.wrapper;

public class NullUnboxing {

    public static void main(String[] args) {

        Integer num = null;

        int value = num; // Runtime error

        System.out.println(value);

    }
}