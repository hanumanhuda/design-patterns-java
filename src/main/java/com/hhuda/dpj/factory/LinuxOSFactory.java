package com.hhuda.dpj.factory;

public class LinuxOSFactory implements OSFactory{
    public IButton getButton() {
        IButton button = new LinuxOSButton();
        button.show();
        return button;
    }

    public IAlert getAlert() {
        IAlert alert = new LinuxOSAlert();
        alert.show();
        return alert;
    }
}
