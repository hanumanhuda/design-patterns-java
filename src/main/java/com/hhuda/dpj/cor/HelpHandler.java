package com.hhuda.dpj.cor;

public abstract class HelpHandler {
    protected String topic;
    protected HelpHandler successor;

    public HelpHandler(HelpHandler helpHandler,String topic){
        successor=helpHandler;
        this.topic=topic;
    }
    void handleHelp(){
       if (successor!=null){
            successor.handleHelp();
        }
    }

    boolean hasHelp(){
        return topic!=null;
    }
}
