package com.manikanta.multithreading;

class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("Running...");
            Thread.sleep(2000);
            System.out.println("Finished");
        } catch (Exception e) {}
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());

        Thread.sleep(100);

        System.out.println("State during execution: " + t.getState());

        t.join();

        System.out.println("State after completion: " + t.getState());
    }
}