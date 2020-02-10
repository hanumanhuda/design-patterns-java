package com.hhuda.dpj.factory;

public class MacOSFactory implements OSFactory{

    public IButton getButton() {
        IButton button = new MacOSButton();
        button.show();
        return button;
    }

    public IAlert getAlert() {
        IAlert alert = new MacOSAlert();
        alert.show();
        return alert;
    }
}
