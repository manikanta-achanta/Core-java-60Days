package com.manikanta.strings;
import java.util.HashSet;
//Longest Substring Without Repeating Characters

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";

        int maxLength = findLongestUniqueSubstring(str);
        System.out.println("Length of longest unique substring: " + maxLength);
    }

    public static int findLongestUniqueSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> seen = new HashSet<>();

        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
