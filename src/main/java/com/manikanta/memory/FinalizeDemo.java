package com.manikanta.memory;

public class FinalizeDemo {

    protected void finalize() {
        System.out.println("GC called");
    }

    public static void main(String[] args) {

        FinalizeDemo obj = new FinalizeDemo();

        obj = null;

        System.gc();

    }
}