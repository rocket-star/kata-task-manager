package com.company.parser_utils;

public class InputParse {

    private final static char ADD_SYMBOL = '+';
    private final static char DONE_SYMBOL = 'x';
    private final static char TODO_SYMBOL = 'o';
    private final static char REMOVE_SYMBOL = '-';

    public static void parse(String input , TaskService taskService) {
        if (input.charAt(0) == ADD_SYMBOL) {
            taskService.addTask(new Task(extract(input, "\\" + ADD_SYMBOL)));
        } else if(input.charAt(0) == DONE_SYMBOL) {
            taskService.getTask(Integer.parseInt(extract(input, String.valueOf(DONE_SYMBOL)))).setDone();
        } else if(input.charAt(0) == TODO_SYMBOL) {
            taskService.getTask(Integer.parseInt(extract(input, String.valueOf(TODO_SYMBOL)))).setTodo();
        } else if (input.charAt(0) == REMOVE_SYMBOL) {
            taskService.removeTaskById(Integer.parseInt(extract(input, String.valueOf(REMOVE_SYMBOL))));
        }
    }

    private static String extract(String input, String symbol) {
        return input.split(symbol)[1].trim();
    }
}
