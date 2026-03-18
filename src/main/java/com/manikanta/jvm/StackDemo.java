package com.manikanta.jvm;

public class StackDemo {

    public static void main(String[] args) {

        methodA();

    }

    static void methodA() {
        int a = 10;
        methodB();
    }

    static void methodB() {
        int b = 20;
    }
}