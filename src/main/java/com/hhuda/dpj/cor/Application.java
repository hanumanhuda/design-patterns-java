package com.hhuda.dpj.cor;

public class Application extends HelpHandler {
    public Application( String topic) {
        super(null, topic);
    }

    void handleHelp(){
        if (topic==null){
            System.out.println("All List of Help here in application");
        }else{
            System.out.println("topic");
        }
    }
}
