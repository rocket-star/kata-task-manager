package com.company.parser_utils;

import java.util.HashMap;

public class TaskService {

    private HashMap<Integer, Task> tasks;
    private int nbTasks;

    public TaskService() {
        this.tasks = new HashMap<>();
        this.nbTasks = 0;
    }

    public void addTask(Task task){
        tasks.put(++nbTasks, task);
    }

    public Task getTask(int id) {
        return tasks.get(id);
    }

    public void removeTaskById(int id) {
        tasks.remove(id);
    }
}
