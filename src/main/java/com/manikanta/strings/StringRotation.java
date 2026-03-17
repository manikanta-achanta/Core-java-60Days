package com.manikanta.strings;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        boolean result = isRotation(s1, s2);
        System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\"? " + result);
    }

    public static boolean isRotation(String s1, String s2) {
        // If lengths differ, they can't be rotations
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate s1 with itself. If s2 is a rotation, it must appear inside.
        String combined = s1 + s1;
        return combined.contains(s2);
    }
}
