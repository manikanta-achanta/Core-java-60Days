package com.manikanta.basics.enums;

enum Color{
    RED, GREEN, BLUE;

}

 public class Loop{

    public static void main(String[] args){

        for (Color c : Color.values()){

            System.out.println(c);
        }
    }
}
