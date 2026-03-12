package com.manikanta.strings;

public class PalindromeString {

    static boolean checkpalin(String s, int n ,int low ,int high) {
        while (low <= high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;

    }
    public static void main(String[] args){

        String s="madama";
        int n=s.length();

        if(checkpalin(s,n,0,n-1))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}