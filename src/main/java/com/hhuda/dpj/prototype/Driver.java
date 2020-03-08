package com.hhuda.dpj.prototype;

public class Driver {
    public static void main(String[] args) {
        Book book1=new KidsBook("ChildPlay","huda","test");
        Book book2=new HistoricalBook("Ramayan",1557);
        PrototypeRegistry.addPrototype("KidsBook",book1);
        PrototypeRegistry.addPrototype("HistoricalBook",book2);
        Book historicalBook1 = PrototypeRegistry.createPrototype("HistoricalBook");
        Book historicalBook2 = PrototypeRegistry.createPrototype("HistoricalBook");
        System.out.println(historicalBook1);
        System.out.println(historicalBook2);
        if (historicalBook1.equals(historicalBook2)){
            System.out.println("both are same objects");
        }else{
            System.out.println("both are different objects");
        }
    }
}
