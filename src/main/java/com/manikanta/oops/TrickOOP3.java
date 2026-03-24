package com.manikanta.oops;

class bStudent {
    String name;
}

public class TrickOOP3 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Java";

        Student s2 = s1;

        s1 = null;

        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}