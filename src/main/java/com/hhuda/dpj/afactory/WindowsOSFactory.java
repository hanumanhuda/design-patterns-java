package com.hhuda.dpj.afactory;

public class WindowsOSFactory extends OSFactory {

    @Override
    public IButton getButton(WidgetType widgetType) {
        switch ( widgetType ){
            case MEDIUM:return new WindowsOSMediumButton();
            case SMALL:return new WindowsOSSmallButton();
        }
        return null;
    }

    @Override
    public IAlert getAlert(WidgetType widgetType) {
        switch ( widgetType ){
            case MEDIUM:return new WindowsOSMediumAlert();
            case SMALL:return new WindowsOSSmallAlert();
        }
        return null;
    }
}
