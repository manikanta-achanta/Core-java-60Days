package com.manikanta.oops.combine_all_oops;

abstract class Vehicle {
    abstract void start();
}

interface Fuel {
    void type();
}

class Car extends Vehicle implements Fuel {

    void start() {
        System.out.println("Car starts with key");
    }

    public void type() {
        System.out.println("Petrol");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();

        Fuel f = new Car();
        f.type();
    }
}
