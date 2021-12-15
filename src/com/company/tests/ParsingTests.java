package com.company.tests;

import com.company.parser_utils.InputParse;
import com.company.parser_utils.TaskService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParsingTests {

    private TaskService taskService = new TaskService();

    @Before
    public void init() throws ClassNotFoundException {
        System.out.println("test");
    }

    @Test
    public void testParsePlus() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);
        assertEquals("Learn Python", taskService.getTask(1).getDescription());
    }

    @Test
    public void testParseX() throws Exception {
        // add Learn Python
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);

        InputParse.parse("x 1", taskService);
        assertTrue(taskService.getTask(1).getIsDone());
    }

    @Test
    public void testParseO() throws Exception {
        // add Learn Python
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);

        InputParse.parse("o 1", taskService);
        assertTrue(taskService.getTask(1).getIsTodo());
    }

    @Test
    public void testParseRemove() throws Exception {
        // add Learn Python
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);

        InputParse.parse("- 1", taskService);
        assertEquals(null, taskService.getTask(1));
    }
}
