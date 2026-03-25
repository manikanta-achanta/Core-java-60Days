package com.manikanta.oops.constructor;

class L {

    L() {
        System.out.println("Constructor");
    }

    void showMethod() {
        System.out.println("Method");
    }
}

public class TrickC2 {

    public static void main(String[] args) {

        L s1 = new L();  // Calls constructor
        s1.showMethod();             // Calls method
    }
}
