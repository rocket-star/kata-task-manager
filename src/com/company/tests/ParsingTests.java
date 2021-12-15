package com.company.tests;

import com.company.parser_utils.InputParse;
import com.company.parser_utils.TaskService;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ParsingTests {

    private final static String TEXT_USER_ADD = "+ Learn Python";
    private TaskService taskService = new TaskService();

    @Test
    public void testParsePlus() throws Exception {

        InputParse.parse(TEXT_USER_ADD, taskService);
        assertEquals("Learn Python", taskService.getTask(1).getDescription());
    }

    @Test
    public void testParseX() throws Exception {

        InputParse.parse(TEXT_USER_ADD, taskService);

        InputParse.parse("x 1", taskService);
        assertTrue(taskService.getTask(1).getIsDone());
    }

    @Test
    public void testParseO() throws Exception {

        InputParse.parse(TEXT_USER_ADD, taskService);

        InputParse.parse("o 1", taskService);
        assertTrue(taskService.getTask(1).getIsTodo());
    }

    @Test
    public void testParseRemove() throws Exception {

        InputParse.parse(TEXT_USER_ADD, taskService);

        InputParse.parse("- 1", taskService);
        assertEquals(null, taskService.getTask(1));
    }
}
