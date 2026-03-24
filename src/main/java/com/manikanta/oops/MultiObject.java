package com.manikanta.oops;

public class MultiObject {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "A";
        s2.name = "B";

        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
