package com.manikanta.io;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        File file1 = new File("dest.txt");
        file1.createNewFile();

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists");
        }
    }
}
