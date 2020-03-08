package com.hhuda.dpj.cor;

public class Dialog extends Widget {
    public Dialog(HelpHandler helpHandler, String topic) {
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
