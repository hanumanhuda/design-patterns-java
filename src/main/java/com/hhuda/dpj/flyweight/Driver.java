package com.hhuda.dpj.flyweight;

import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        GlyphFactory glyphFactory=new GlyphFactory();
        //Context is usually calculated and it is not static for example we have kept it
        GlyphContext glyphContext=new GlyphContext();
        glyphContext.setFont(10);
        for (int i=0;i<10000;i++){
            char ch= (char)new Random().nextInt(8);
            Character character=glyphFactory.getCharacter(ch);
            character.draw(glyphContext);
        }
    }
}
