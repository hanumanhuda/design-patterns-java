package com.hhuda.dpj.strategy;

public class SimpleQuackStrategy implements IQuackStrategy {
    public void quack() {
        System.out.println(this);
    }
}
