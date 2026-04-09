package com.manikanta.basics.static_usage;

class test {
    static int x = 10;

    static {
        x = x + 5;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
