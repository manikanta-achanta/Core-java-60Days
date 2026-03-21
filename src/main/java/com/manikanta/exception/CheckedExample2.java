package com.manikanta.exception;

import java.io.IOException;

public class CheckedExample2 {

    static void readFile() throws IOException {
        throw new IOException("File error");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }

    }
}