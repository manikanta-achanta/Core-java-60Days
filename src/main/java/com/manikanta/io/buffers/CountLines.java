package com.manikanta.io.buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            int count = 0;

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Lines: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
