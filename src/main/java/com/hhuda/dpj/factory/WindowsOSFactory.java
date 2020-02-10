package com.hhuda.dpj.factory;

public class WindowsOSFactory implements OSFactory {
    public IButton getButton() {
        IButton button = new WindowsOSButton();
        button.show();
        return button;
    }

    public IAlert getAlert() {
        IAlert alert = new WindowsOSAlert();
        alert.show();
        return alert;
    }
}
