package com.hhuda.dpj.decorator;

public class Driver {
    public static void main(String[] args) {
        Caramel caramel = new Caramel(new Espresso());
        System.out.println("Caramel Cost: "+caramel.cost());
        Cardamom cardamom = new Cardamom(caramel);
        System.out.println("Cardamom with Caramel cost:"+cardamom.cost());
    }
}
