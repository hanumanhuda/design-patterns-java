package com.hhuda.dpj.singleton;

public class RuntimeEnvDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime anotherRuntime =  Runtime.getRuntime();
        System.out.println(anotherRuntime);

        if(runtime == anotherRuntime){
            System.out.println("both instance are same");
        }else {
            System.out.println("both instances are different");
        }
    }
}
