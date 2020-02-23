package com.hhuda.dpj.template;

public abstract class Record {
    public void save(){
        System.out.println("Executed validation query");
        this.validate();
        System.out.println("Executed Save");
        this.executeOnFail();
    }
    public abstract void validate();
    public abstract void executeOnFail();
}
