package com.hhuda.dpj.iterator;

import java.util.ListIterator;

public class Driver {
    public static void main(String[] args) {
        Item item1 = Item.builder().name("laptop").build();
        Item item2 = Item.builder().name("Ipad").build();
        Inventory inventory=new HandHeldInventory(item1,item2);

        Iterator iterator = inventory.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
