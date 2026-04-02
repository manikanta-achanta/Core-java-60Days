package com.manikanta.io;

import java.io.*;

public class Deletedirectory {
    public static void main(String[] args)
    {
        File file= new File("myFolder");

        if(file.delete())
        {
            System.out.println("folder delected");
        }
        else {
            System.out.print("folder not exist");
        }



    }

}
