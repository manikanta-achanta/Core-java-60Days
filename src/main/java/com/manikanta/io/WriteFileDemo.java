package com.manikanta.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("test.txt",true);

        String data = "Hello Java";

        fos.write(data.getBytes());

        fos.close();
    }
}