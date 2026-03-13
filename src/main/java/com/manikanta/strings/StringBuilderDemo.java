package com.manikanta.strings;


public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=5;i++)
        {
            sb.append(i);
        }

        System.out.println(sb);

    }
}