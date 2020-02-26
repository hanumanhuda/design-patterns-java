package com.hhuda.dpj.composite;

public class Todo implements TodoList {
    private String text;
    public Todo(String text){
        this.text =text;
    }
    @Override
    public String getHtml() {
        return text;
    }
}
