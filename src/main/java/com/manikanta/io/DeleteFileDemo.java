package com.manikanta.io;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.delete()) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("File not found");
        }
    }
}
