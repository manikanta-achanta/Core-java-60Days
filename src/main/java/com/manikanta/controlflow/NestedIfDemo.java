package com.manikanta.controlflow;

public class NestedIfDemo {

    public static void main(String[] args) {

        int age = 25;
        boolean hasLicense = true;

        if(age >= 18){

            if(hasLicense){
                System.out.println("Can drive");
            }else{
                System.out.println("License required");
            }

        }else{
            System.out.println("Too young to drive");
        }
    }
}