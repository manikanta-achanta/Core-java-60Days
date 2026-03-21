package com.manikanta.exception;

import java.io.FileReader;
import java.io.IOException;


public class CheckedExample1 {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");
            System.out.println("File opened");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }

    }
}