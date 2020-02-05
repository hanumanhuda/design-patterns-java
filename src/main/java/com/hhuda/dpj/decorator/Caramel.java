package com.hhuda.dpj.decorator;

public class Caramel extends AddOnDecorator {
    private Beverage beverage;
    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }
    public int cost() {
        return beverage.cost()+1;
    }
}
