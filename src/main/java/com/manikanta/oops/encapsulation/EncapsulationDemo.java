package com.manikanta.oops.encapsulation;

class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Manikanta");
        s.setAge(16);   // invalid
        s.setAge(21);   // valid

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
