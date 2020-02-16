package com.hhuda.dpj.command;

public class Driver {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new LightOnCommand(new Light()));
        invoker.clickOn();
    }
}
