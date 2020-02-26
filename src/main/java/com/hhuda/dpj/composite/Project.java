package com.hhuda.dpj.composite;

import java.util.List;

public class Project implements TodoList{
    private String title;
    private List<TodoList> todos;

    public Project(String title, List<TodoList> todoList){
        this.title = title;
        todos = todoList;
    }

    @Override
    public String getHtml() {
        StringBuilder html=new StringBuilder();
        html.append(this.title);
        html.append("</li>");
        html.append("<ul>");
        for (TodoList todo:todos
             ) {
            html.append("<li>");
            html.append(todo.getHtml());
            html.append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
