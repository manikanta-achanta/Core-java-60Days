package com.manikanta.oops;

class aStudent {
    String name;
}

public class TrickOOP2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Java";

        Student s2 = new Student();
        s2.name = "Python";

        s2 = s1;

        s2.name = "C++";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}