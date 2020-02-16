package com.hhuda.dpj.command;

public class Invoker {
    Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void clickOn(){
        command.execute();
    }
    public void  clickOff(){
        command.unExecute();
    }
}
