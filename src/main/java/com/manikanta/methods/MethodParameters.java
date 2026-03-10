package com.manikanta.methods;

public class MethodParameters {

    void add(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args){

        MethodParameters obj = new MethodParameters();
        obj.add(10,20);

    }
}