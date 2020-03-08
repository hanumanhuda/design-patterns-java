package com.hhuda.dpj.iterator;

public class HandHeldInventory implements Inventory {
    private Item left,right;

    public HandHeldInventory(Item left,Item right){
        this.left=left;
        this.right=right;
    }
    @Override
    public Iterator getIterator() {
        return new HandHeldInventoryIterator(this);
    }

    public Item getLeft(){
        return left;
    }
    public Item getRight(){
        return right;
    }
}
