package com.company.tests;

import com.company.parser_utils.InputParse;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ParsingTests {

    @Test
    public void testParsePlus() throws Exception {
       String input = "+ Learn Python";
       InputParse.parse(input);
        assertEquals("Learn Python", InputParse.getTasks(1).getDescription());
    }

    @Test
    public void testParseX() throws Exception {
        String input = "x 1";
        InputParse.parse(input);
        assertTrue(InputParse.getTasks(1).getIsDone());
    }
}
