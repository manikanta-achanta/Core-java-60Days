package com.manikanta.oops.combine_all_oops;

interface Payment {
    void pay();
}

abstract class Bank {
    abstract void bankName();

    void common() {
        System.out.println("Common banking logic");
    }
}

class UPI extends Bank implements Payment {

    public void pay() {
        System.out.println("UPI Payment");
    }

    void bankName() {
        System.out.println("SBI Bank");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();

        Bank b = new UPI();
        b.bankName();
        b.common();
    }
}
