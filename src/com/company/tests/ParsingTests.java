package com.company.tests;

import com.company.parser_utils.InputParse;
import com.company.parser_utils.Task;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ParsingTests {

    @Test
    public void testParsePlus() throws Exception {
       String input = "+ Learn Python";
       Task result = InputParse.parse(input);
        assertEquals("Learn Python", result.getDescription());
    }

    @Test
    public void testParseX() throws Exception {
        String input = "x 1";
        Task result = InputParse.parse(input);
        assertTrue(InputParse.getTasks(1).getDone());
    }
}
