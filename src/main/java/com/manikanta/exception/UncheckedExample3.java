package com.manikanta.exception;

public class UncheckedExample3 {

    public static void main(String[] args) {

        try {
            int arr[] = new int[3];

            arr[5] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}