package com.thirdpackage;

class Sample{
    float salary=40000;
    int hike=100;
}
class Programmer extends Sample{
    int bonus=10000;


}
class Coder extends Programmer{

    int extra=2000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        Sample s=new Sample();
        Coder c=new Coder();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.hike);
        System.out.println("Programmer salary is:"+p.bonus);
        System.out.println("Bonus of Programmer is:"+c.extra);
    }
}