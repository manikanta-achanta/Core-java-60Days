package com.manikanta.oops.constructor;


class Student {

    Student() {
        this(10);
        System.out.println("A");
    }

    Student(int x) {
        this(20, 30);
        System.out.println("B");
    }

    Student(int x, int y) {
        System.out.println("C");
    }
}

public class TrickC1 {

    public static void main(String[] args) {

        Student s1 = new Student();

    }
}
