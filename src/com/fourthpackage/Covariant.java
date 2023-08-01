package com.fourthpackage;

class Abcd{
    Abcd get(){return this;}

}
class Xyze extends Abc{
    Xyze get(){return this;
    }
    void message(){
        System.out.println("covariant return type");
    }

}
public class Covariant {
    public static void main(String[] args) {
        new Xyze().get().message();

    }
}
