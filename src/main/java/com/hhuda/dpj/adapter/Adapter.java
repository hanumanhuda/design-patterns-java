package com.hhuda.dpj.adapter;

public class Adapter implements Target{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request() {
        this.adaptee.specificRequest();
    }
}
