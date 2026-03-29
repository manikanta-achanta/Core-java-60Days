package com.manikanta.oops.polymorphism;

class Aanimal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Aanimal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cow extends Aanimal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Aanimal a;

        a = new Dog();
        a.sound();

        a = new Cow();
        a.sound();
    }
}
