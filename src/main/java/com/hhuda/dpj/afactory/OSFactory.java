package com.hhuda.dpj.afactory;

public abstract class OSFactory {
    public static OSFactory getFactory(OSTypes osTypes){
        switch ( osTypes ){
            case LINUX:return new LinuxOSFactory();
            case WINDOWS:return new WindowsOSFactory();
        }
        return null;
    }

    public abstract IButton getButton(WidgetType widgetType);
    public abstract IAlert getAlert(WidgetType widgetType);
}
