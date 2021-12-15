package com.company.tests;

import com.company.parser_utils.InputParse;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ParsingTests {

    @Before
    public void init() throws ClassNotFoundException {
        Class.forName("com.company.parser_utils.InputParse");
    }

    @Test
    public void testParsePlus() throws Exception {
       String input = "+ Learn Python";
       InputParse.parse(input);
        assertEquals("Learn Python", InputParse.getTasks(1).getDescription());
    }

    @Test
    public void testParseX() throws Exception {
        // add Learn Python
        String input = "+ Learn Python";
        InputParse.parse(input);

        InputParse.parse("x 1");
        assertTrue(InputParse.getTasks(1).getIsDone());
    }

    @Test
    public void testParseO() throws Exception {
        // add Learn Python
        String input = "+ Learn Python";
        InputParse.parse(input);

        InputParse.parse("o 1");
        assertTrue(InputParse.getTasks(1).getIsTodo());
    }

    @Test
    public void testParseRemove() throws Exception {
        String input = "- 1";
        InputParse.parse(input);
        assertEquals(null, InputParse.getTasks(1));
    }
}
