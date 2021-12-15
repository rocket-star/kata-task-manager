package com.company.parser_utils;

public class InputParse {

    private final static char ADD_SYMBOL = '+';
    private final static char DONE_SYMBOL = 'x';
    private final static char TODO_SYMBOL = 'o';

    private static TaskService taskService = new TaskService();

    public static void parse(String input) {
        if (input.charAt(0) == ADD_SYMBOL) {
            taskService.addTask(new Task(extract(input, "\\" + ADD_SYMBOL)));
        } else if(input.charAt(0) == DONE_SYMBOL) {
            taskService.getTask(Integer.parseInt(extract(input, String.valueOf(DONE_SYMBOL)))).setDone();
        } else if(input.charAt(0) == TODO_SYMBOL) {
            taskService.getTask(Integer.parseInt(extract(input, String.valueOf(TODO_SYMBOL)))).setTodo();
        }
    }

    public static Task getTasks(int id) {
        return taskService.getTask(id);
    }

    private static String extract(String input, String symbol) {
        return input.split(symbol)[1].trim();
    }
}
