package com.manikanta.strings;

public class TrimDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Capacity before trim: " + sb.capacity());

        sb.trimToSize();

        System.out.println("Capacity after trim: " + sb.capacity());

    }

}