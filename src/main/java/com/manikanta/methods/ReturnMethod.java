package com.manikanta.methods;

public class ReturnMethod {

    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){

        ReturnMethod obj = new ReturnMethod();
        int result = obj.add(5,7);

        System.out.println(result);
    }
}