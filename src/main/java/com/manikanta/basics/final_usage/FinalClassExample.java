package com.manikanta.basics.final_usage;

final class A {
    void show() {
        System.out.println("A");
    }
}

// ❌ Error: cannot inherit from final A
// class B extends A {
//     void show() {
//         System.out.println("B");
//     }
// }

public class FinalClassExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();  // Output: A
    }
}

