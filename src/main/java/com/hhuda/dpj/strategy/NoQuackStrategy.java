package com.hhuda.dpj.strategy;

public class NoQuackStrategy implements IQuackStrategy{
    public void quack() {
        System.out.println(this);
    }
}
