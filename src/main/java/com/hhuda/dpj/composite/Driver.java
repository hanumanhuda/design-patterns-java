package com.hhuda.dpj.composite;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        TodoList todo1=new Todo("Task 1");
        TodoList todo2=new Todo("Task 2");

        TodoList todo31=new Todo("Task 31");
        TodoList todo32=new Todo("Task 32");
        List<TodoList> list=new ArrayList<>();
        list.add(todo31);
        list.add(todo32);
        TodoList task= new Project("Task 3",list);

        List<TodoList> taskList=new ArrayList<>();
        taskList.add(todo1);
        taskList.add(todo2);
        taskList.add(task);

        TodoList project =new Project("Project 1",taskList);
        System.out.println(project.getHtml());


    }
}
