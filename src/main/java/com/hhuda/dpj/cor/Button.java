package com.hhuda.dpj.cor;

public class Button extends Widget {
    public Button(HelpHandler helpHandler, String topic) {
        super(helpHandler, topic);
    }
    void handleHelp(){
        if (hasHelp()){
            System.out.println(topic);
        }else{
            System.out.println("Button No Help");
            successor.handleHelp();
        }
    }

}
