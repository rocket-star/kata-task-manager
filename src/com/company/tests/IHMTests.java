package com.company.tests;

import com.company.fake.FakeIHM;
import com.company.parser_utils.InputParse;
import com.company.parser_utils.TaskService;
import org.junit.Before;
import org.junit.Test;


import static org.testng.AssertJUnit.assertEquals;

public class IHMTests {
    private FakeIHM fakeIHM;
    private TaskService taskService;

    @Before
    public void before() throws Exception {
        fakeIHM = new FakeIHM();
        taskService = new TaskService();
    }

    @Test
    public void testInput() throws Exception {
        String input = "+ Learn Python";
        fakeIHM.write(input);
        assertEquals("+ Learn Python", fakeIHM.getPrintedWords().get(0));
    }

    @Test
    public void testDisplayTask() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);
        fakeIHM.write(taskService.toString());
        assertEquals("1 [] Learn Python\n", fakeIHM.getPrintedWords().get(0));
    }

    @Test
    public void testDisplayTasks() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);

        String input2 = "+ Learn SQL";
        InputParse.parse(input2, taskService);
        fakeIHM.write(taskService.toString());
        assertEquals("1 [] Learn Python\n2 [] Learn SQL\n", fakeIHM.getPrintedWords().get(0));
    }

    @Test
    public void testDisplayDoneTasks() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);


        String input2 = "+ Learn SQL";
        InputParse.parse(input2, taskService);

        String input3 = "x 1";
        InputParse.parse(input3, taskService);
        fakeIHM.write(taskService.toString());
        assertEquals("1 [x] Learn Python\n2 [] Learn SQL\n", fakeIHM.getPrintedWords().get(0));
    }

    @Test
    public void testDisplayToDoTasks() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);


        String input2 = "+ Learn SQL";
        InputParse.parse(input2, taskService);

        String input3 = "o 2";
        InputParse.parse(input3, taskService);
        fakeIHM.write(taskService.toString());
        assertEquals("1 [] Learn Python\n2 [o] Learn SQL\n", fakeIHM.getPrintedWords().get(0));
    }

    @Test
    public void testDisplayRemoveTasks() throws Exception {
        String input = "+ Learn Python";
        InputParse.parse(input, taskService);


        String input2 = "+ Learn SQL";
        InputParse.parse(input2, taskService);

        String input3 = "- 1";
        InputParse.parse(input3, taskService);
        fakeIHM.write(taskService.toString());
        assertEquals("2 [] Learn SQL\n", fakeIHM.getPrintedWords().get(0));
    }
}
