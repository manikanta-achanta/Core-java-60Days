package com.manikanta.basics.enums;

//we can declare the enum outside the class or inside the class also but we should not declare the enum  inside the method

enum Status {
    PENDING, SUCCESS, FAILED
}

public class Test {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;

        System.out.println(s);
    }
}
