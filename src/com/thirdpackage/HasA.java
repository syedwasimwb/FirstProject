package com.thirdpackage;

public class HasA {
    int addressLineOne;
    int addressLineTwo;
    AbstractionClass abs;
    HasA(int addressLineOne, int addressLineTwo, AbstractionClass abs){
        this.addressLineOne=addressLineOne;
        this.addressLineTwo=addressLineTwo;
        this.abs=abs;
    }


    public static void main(String[] args) {
        AbstractionClass abs=new AbstractionClass(1,"Wasim");
        HasA ha=new HasA(2,3,abs);
        System.out.println(ha.addressLineOne+" "+abs.name);
    }
}
