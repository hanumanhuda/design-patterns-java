package com.hhuda.dpj.factory;

public class Driver {
    public static void main(String[] args) {
        OSFactory factory = FactoryProvider.getFactory(OSTypes.LINUX);
        factory.getAlert();
        factory.getButton();
    }
}
