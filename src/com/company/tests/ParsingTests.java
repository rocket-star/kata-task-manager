package com.company.tests;

import com.company.parser_utils.InputParse;
import com.company.parser_utils.Task;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ParsingTests {

    @Test
    public void testParsePlus() throws Exception {
       String input = "+ Learn Python";
       Task result = InputParse.parse(input);
        assertEquals("Learn Python", result.getDescription());
    }
}
