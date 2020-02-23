package com.hhuda.dpj.bridge;

public class LongFormatView extends View {
    public LongFormatView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return resource.getTitle()+", "+resource.getUrl();
    }
}
