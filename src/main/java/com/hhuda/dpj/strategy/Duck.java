package com.hhuda.dpj.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Duck {
   IFlyStrategy iFlyStrategy;
   IDisplayStrategy iDisplayStrategy;
   IQuackStrategy iQuackStrategy;

    public void fly(){
        iFlyStrategy.fly();
    }

    public void display(){
        iDisplayStrategy.display();
    }
    public void quack(){
        iQuackStrategy.quack();
    }
}
