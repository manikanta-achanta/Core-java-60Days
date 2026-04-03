package com.manikanta.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingBuffer {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("test.txt")) {

            byte[] buffer = new byte[10];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}