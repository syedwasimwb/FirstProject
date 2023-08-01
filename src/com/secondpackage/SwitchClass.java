package com.secondpackage;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String fruit = scan.next();
        switch (fruit){
            case "Mango"->
                System.out.println("Fruit is mango");

            case "Apple"->
                System.out.println("Fruit is apple");

            default->
                System.out.println("default case");
        }
    }
}
