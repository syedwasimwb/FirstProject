package com.fourthpackage;

class Abc{
    void method(int a){
        System.out.println("int"+ a);
    }
    void method(double b){
        System.out.println("double"+b);
    }
}
class Xyz extends Abc{
    @Override
    void method(int c) {
        System.out.println("child int"+c);
    }
}
public class OverridingTest {
    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.method(10.2);

    }
}
