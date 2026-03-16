package com.manikanta.strings;

public class EnsureCapacityDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println("Default capacity: " + sb.capacity());

        sb.ensureCapacity(50);

        System.out.println("New capacity: " + sb.capacity());

    }

}