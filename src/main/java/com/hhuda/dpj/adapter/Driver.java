package com.hhuda.dpj.adapter;

public class Driver {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
