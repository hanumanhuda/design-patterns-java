package com.hhuda.dpj.bridge;

public abstract class View {
    Resource resource;
    public View(Resource resource){
        this.resource = resource;
    }
    public abstract String show();
}
