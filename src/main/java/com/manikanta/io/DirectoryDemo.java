package com.manikanta.io;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {

        File dir = new File("myFolder");

        if (dir.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Already exists");
        }
    }
}
