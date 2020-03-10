package com.hhuda.dpj.afactory;

public class Driver {
    public static void main(String[] args) {

        //Linux OS
        System.out.println("=======Linux OS========");
        OSFactory abstractFactory = OSFactory.getFactory(OSTypes.LINUX);
        IAlert alert = abstractFactory.getAlert(WidgetType.MEDIUM);
        IButton button = abstractFactory.getButton(WidgetType.SMALL);
        System.out.println(abstractFactory.getClass());
        System.out.println(alert.getClass());
        System.out.println(button.getClass());

        System.out.println("=======Windows OS========");
        OSFactory abstractFactory1 = OSFactory.getFactory(OSTypes.WINDOWS);
        IAlert alert1 = abstractFactory.getAlert(WidgetType.MEDIUM);
        IButton button1 = abstractFactory.getButton(WidgetType.SMALL);
        System.out.println(abstractFactory1.getClass());
        System.out.println(alert1.getClass());
        System.out.println(button1.getClass());

    }
}
