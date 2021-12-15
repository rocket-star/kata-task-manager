package com.company.parser_utils;

public class InputParse {

    private static TaskService taskService = new TaskService();

    public static void parse(String input) {
        if(input.charAt(0) == '+'){
            taskService.addTask(new Task(input.split("\\+")[1].trim()));
        }else if(input.charAt(0) == 'x'){
            taskService.getTask(Integer.parseInt(input.split("x")[1].trim())).setDone();
        }
    }

    public static Task getTasks(int id) {
        return taskService.getTask(id);
    }
}
