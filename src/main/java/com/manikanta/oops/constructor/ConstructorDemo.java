package com.manikanta.oops.constructor;

class Learner {

    String name;
    int id;

    Learner() {
        this("Default", 0);
    }

    Learner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(name + " " + id);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        Learner s1 = new Learner();
        Learner s2 = new Learner("Java", 101);

        s1.display();
        s2.display();
    }
}
