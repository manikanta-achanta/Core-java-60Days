package com.manikanta.wrapper;

public class CompareRanges {
    public static void main(String[] args)
    {

        //because the range is from only -128 to 127 then only it will be  true
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;


        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }

}
