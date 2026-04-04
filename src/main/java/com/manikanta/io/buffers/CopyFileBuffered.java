package com.manikanta.io.buffers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileBuffered {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("dest.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}