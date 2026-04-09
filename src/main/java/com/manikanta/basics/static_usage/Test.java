package com.manikanta.basics.static_usage;


 class Test {
    static int count = 0;

    Test() {
        count++;
    }
}

 class main {
    public static void main(String[] args) {
        new Test();
        new Test();
        System.out.println(Test.count); // 2
    }
}