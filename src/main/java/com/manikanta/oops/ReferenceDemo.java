package com.manikanta.oops;

public class ReferenceDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Java";

        Student s2 = s1;

        s2.name = "Python";

        System.out.println(s1.name);

    }
}
