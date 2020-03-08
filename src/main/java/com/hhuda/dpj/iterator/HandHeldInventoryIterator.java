package com.hhuda.dpj.iterator;

public class HandHeldInventoryIterator implements Iterator {
    private HandHeldInventory handHeldInventory;
    private int index;
    public HandHeldInventoryIterator(HandHeldInventory handHeldInventory) {
        this.handHeldInventory = handHeldInventory;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<2;
    }

    @Override
    public Item next() {
        switch ( index ){
            case 0: index++;
                return handHeldInventory.getLeft();
            case 1: index++;
                return handHeldInventory.getRight();
            default:
                throw new IndexOutOfBoundsException();
        }
    }
}
