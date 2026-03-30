package com.manikanta.oops.abstraction;

abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() {
        System.out.println("UPI Payment");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Card Payment");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}
