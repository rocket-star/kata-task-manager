package com.company.parser_utils;

import java.util.HashMap;

public class Task {
    // Description de la task
    private String description;

    // Etat de la task
    private boolean isDone;

    public Task(String description){
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDone() {
        isDone = true;
    }
}
