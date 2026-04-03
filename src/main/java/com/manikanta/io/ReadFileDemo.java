package com.manikanta.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("test.txt");

        int data;

        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }

        fis.close();
    }
}