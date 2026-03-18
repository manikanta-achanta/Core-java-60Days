package com.manikanta.jvm;

public class HeapDemo {

    int value;

    public static void main(String[] args) {

        HeapDemo obj1 = new HeapDemo();
        obj1.value = 10;

        HeapDemo obj2 = new HeapDemo();
        obj2.value = 20;

        HeapDemo obj3 = obj1;
        System.out.println(obj1.value);

    }
}