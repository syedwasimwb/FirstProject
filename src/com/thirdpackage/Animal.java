package com.thirdpackage;

class Animal{
    int id;
    Animal(int id){
        this.id=id;
    }
    void eat(){System.out.println(id);}
}
class Dog extends Animal{
    int bd;
    Dog(int id,int bd) {

        super(id);
        this.bd=bd;
    }

//    void eat(){
//        super.eat();
//        System.out.println("dog is eating");
//    }
//    void work(){
//        super.eat();
//        eat();
//
//    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog d=new Dog(10,20);
        d.eat();
    }}