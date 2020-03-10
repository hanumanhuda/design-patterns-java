package com.hhuda.dpj.afactory;

import com.hhuda.dpj.afactory.OSFactory;

public class LinuxOSFactory extends OSFactory {
    public IButton getButton(WidgetType widgetType) {
        switch ( widgetType ){
            case MEDIUM:return new LinuxOSMediumButton();
            case SMALL:return new LinuxOSSmallButton();
        }
        return null;
    }

    @Override
    public IAlert getAlert(WidgetType widgetType) {
        switch ( widgetType ){
            case MEDIUM:return new LinuxOSMediumAlert();
            case SMALL:return new LinuxOSSmallAlert();
        }
        return null;
    }
}
