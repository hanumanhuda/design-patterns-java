package com.hhuda.dpj.factory;

public class FactoryProvider {
    public static OSFactory getFactory(OSTypes osTypes){
        switch ( osTypes ) {
            case MAC:
                return new MacOSFactory();
            case LINUX:
                return new LinuxOSFactory();
            case WINDOWS:
                return new WindowsOSFactory();
        }
        return null;
    }
}
