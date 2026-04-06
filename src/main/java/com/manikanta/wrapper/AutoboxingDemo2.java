package com.manikanta.wrapper;


import java.util.ArrayList;

class autoboxing2 {
    public static void main(String[] args) {
        char ch = 'a';

        // Autoboxing: char -> Character
        Character c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        // Autoboxing: int -> Integer
        list.add(25);
        System.out.println(list.get(0));
    }
}
