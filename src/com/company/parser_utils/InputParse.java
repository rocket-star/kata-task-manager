package com.company.parser_utils;

public class InputParse {
    public static Task parse(String input) {
        return new Task(input.split("\\+")[1].trim());
    }
}
