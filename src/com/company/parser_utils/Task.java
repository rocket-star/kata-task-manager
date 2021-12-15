package com.company.parser_utils;

public class Task {

    private String description;
    private boolean isDone;
    private boolean isTodo;

    public Task(String description){
        this.description = description;
        this.isDone = false;
        this.isTodo = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDone() {
        isDone = true;
    }

    public boolean getIsTodo() {
        return isTodo;
    }

    public void setTodo() {
        isTodo = true;
    }
}
