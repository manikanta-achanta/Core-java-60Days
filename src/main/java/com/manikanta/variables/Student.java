package com.manikanta.variables;

public class Student {

    String name;  //instance variable
    int age;      // instance variable

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Manikanta";
        s.age = 21;

        System.out.println(s.name);
        System.out.println(s.age);
    }
}
