package com.hhuda.dpj.singleton;

public class BasicSingletonDemo {
    public static void main(String[] args) {
        BasicSingleton instance= BasicSingleton.getInstance();
        System.out.println(instance);

        BasicSingleton anotherInstance= BasicSingleton.getInstance();
        System.out.println(anotherInstance);

        if(instance== anotherInstance){
            System.out.println("both instance are same");
        }else {
            System.out.println("both instances are different");
        }
    }
}
