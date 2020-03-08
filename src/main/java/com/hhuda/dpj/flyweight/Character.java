package com.hhuda.dpj.flyweight;

public class Character implements Glyph{
    private char charCode;
    public Character(char ch){
        this.charCode=ch;
    }

    @Override
    public void draw(GlyphContext glyphContext) {
        System.out.println(charCode+","+glyphContext.getFont());
    }
}
