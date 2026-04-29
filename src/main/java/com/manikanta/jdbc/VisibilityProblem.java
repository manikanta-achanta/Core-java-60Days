package com.manikanta.jvm;

public class VisibilityProblem {

    static boolean flag = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            flag = true;
            System.out.println("Thread 1 updated flag");
        });

        Thread t2 = new Thread(() -> {
            while (!flag) {
                // waiting
            }
            System.out.println("Thread 2 detected change");
        });

        t1.start();
        t2.start();
    }
}