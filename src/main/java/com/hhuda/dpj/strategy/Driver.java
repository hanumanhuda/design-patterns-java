package com.hhuda.dpj.strategy;

public class Driver {
    public static void main(String[] args) {
        IFlyStrategy iFlyStrategy = new SimpleFlyStrategy();
        IQuackStrategy  iQuackStrategy =  new NoQuackStrategy();
        IDisplayStrategy iDisplayStrategy = new GraphicDisplayStrategy();

        Duck duck = new Duck(iFlyStrategy, iDisplayStrategy, iQuackStrategy);
        duck.display();
        duck.fly();
        duck.quack();
    }

}
