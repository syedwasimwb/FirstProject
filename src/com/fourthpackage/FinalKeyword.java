package com.fourthpackage;

public class FinalKeyword {
    final int a =10;
    void method(){
        int a =20;
        System.out.println("int os" + a);
    }


    public static void main(String[] args) {
        new FinalKeyword().method();
    }
}
