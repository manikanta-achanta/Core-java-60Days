package com.manikanta.wrapper;

import java.util.ArrayList;

class unboxing {
    public static void main(String[] args) {

        Character ch = 'a';
        // Unboxing: Character -> char
        char c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        // Unboxing: Integer -> int
        int num = list.get(0);

        System.out.println(num);
    }
}