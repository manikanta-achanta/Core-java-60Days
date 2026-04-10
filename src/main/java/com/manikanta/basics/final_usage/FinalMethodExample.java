package com.manikanta.basics.final_usage;

class A1 {
    final void show() {
        System.out.println("A");
    }
}

class B extends A1 {
    // ❌ This will cause a compile-time error:
    // "cannot override the final method from A"
    // void show() {
    //     System.out.println("B");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        A1 objA = new A1();
        objA.show();  // Output: A

        B objB = new B();
        objB.show();  // Output: A (inherited from class A)
    }
}

