package com.fourthpackage;

class Base{
    void method(){
        System.out.println("Base method");
    }
}
class Derived extends Base{
    void method(){
        System.out.println("derived method");
    }

}

public class BaseDerived {
    public static void main(String[] args) {
        Base b=new Derived();
        b.method();
    }
}
