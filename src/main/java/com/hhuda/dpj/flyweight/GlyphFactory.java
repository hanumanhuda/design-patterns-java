package com.hhuda.dpj.flyweight;

public class GlyphFactory {
    private static final int NUM_OF_CHARS=256;
    private Character character[];

    public GlyphFactory(){
        character=new Character[NUM_OF_CHARS];
        for(int i=0;i<NUM_OF_CHARS;i++){
            character[i]=null;
        }
    }

    public Character getCharacter(char ch){
        if (character[ch]==null){
            character[ch]=new Character(ch);
        }
        return character[ch];
    }
}
