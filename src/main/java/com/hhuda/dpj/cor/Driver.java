package com.hhuda.dpj.cor;

public class Driver {
    public static void main(String[] args) {
        Application application=new Application("All Application help");
        Dialog dialog=new Dialog(application,"dialog help");
        Button button = new Button(dialog,null);

        button.handleHelp();
    }
}
