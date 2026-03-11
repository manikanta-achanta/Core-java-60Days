package com.manikanta.recursion;

public class PowerRecursion {

    static int power(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }

        return a*power(a,b-1);
    }

    public static void main(String[] args)
    {
        int a=2;
        int b=3;
        int res=power(a,b);
        System.out.print(res);
    }


}
