package com.manikanta.multithreading;

public class DeadlockDemo {

    public static void main(String[] args) {

        String lock1 = "LOCK1";
        String lock2 = "LOCK2";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding LOCK1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding LOCK2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding LOCK2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding LOCK1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}