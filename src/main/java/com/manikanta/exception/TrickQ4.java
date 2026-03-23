package com.manikanta.exception;

class MyResource implements AutoCloseable {

    public void close() {
        System.out.println("Closed");
    }
}

public class TrickQ4 {

    public static void main(String[] args) {

        try (MyResource r = new MyResource()) {
            System.out.println("Try");
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Catch");
        }

    }
}