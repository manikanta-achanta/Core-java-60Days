package com.manikanta.io.buffers;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt",true));

        bw.write("Hello Java");
        bw.newLine();
        bw.write("Buffered Writing");
        bw.newLine();

        bw.close();
    }
}
