package com.hhuda.dpj.decorator;

public class Cardamom extends AddOnDecorator {
    private Beverage beverage;
    public Cardamom(Beverage beverage){
        this.beverage = beverage;
    }
    public int cost() {
        return beverage.cost()+2;
    }
}
