package com.manikanta.collections.comparable;

import java.util.*;

class Student implements Comparable<Student> {
    int id;

    Student(int id) {
        this.id = id;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // ascending
    }
}

public class Test {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3));
        list.add(new Student(1));
        list.add(new Student(2));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.id);
        }
    }
}
