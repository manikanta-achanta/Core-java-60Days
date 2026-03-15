package com.manikanta.strings;

public class BufferCapacityDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println("Capacity: " + sb.capacity());

        sb.append("Hello");

        System.out.println("Length: " + sb.length());

    }

}