package com.hhuda.dpj.cor;

public class Widget extends HelpHandler {
    public Widget(HelpHandler helpHandler, String topic) {
        super(helpHandler, topic);
    }

    void handleHelp(){
        if (hasHelp()){
            System.out.println(topic);
        }else{
            successor.handleHelp();
        }
    }
}
