package com.manikanta.collections.comparator;

import java.util.*;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3));
        list.add(new Student(1));
        list.add(new Student(2));

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.id - b.id;
            }
        });

        for (Student s : list) {
            System.out.println(s.id);
        }
    }
}
